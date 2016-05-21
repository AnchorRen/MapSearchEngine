package com.lmars.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.compoment.JedisClient;
import com.lmars.manage.service.WMSLayerService;
import com.lmars.manage.service.WMSService;
import com.lmars.mapper.TbWmsLayersMapper;
import com.lmars.mapper.TbWmsMapper;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbMapserviceLayersExample;
import com.lmars.pojo.TbWmsExample;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;
import com.lmars.pojo.TbWmsLayersExample.Criteria;
import com.lmars.pojo.TbWmsWithBLOBs;
@Service
public class WMSServiceImpl implements WMSService {

	@Autowired
	private TbWmsMapper wmsMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Autowired
	private WMSLayerService wmsLayerService;
	
	@Autowired
	private TbWmsLayersMapper wmsLayerMapper;
	
	@Override
	public EasyUIDataGridResult getWMSList(int page, int rows) {
		
		//分页处理
		PageHelper.startPage(page, rows);
		
		TbWmsExample example = new TbWmsExample();
		//执行查询
		List<TbWmsWithBLOBs> list = wmsMapper.selectByExampleWithBLOBs(example);
		//获取分页信息
		
		PageInfo<TbWmsWithBLOBs> pageInfo = new PageInfo<>(list);
		//返回查询结果
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	}

	@Override
	public MapResult updateWMSLayer(TbWmsWithBLOBs wms) {
		try {
			//更新数据库中的数据
			int result = wmsMapper.updateByPrimaryKeyWithBLOBs(wms);
			
			//删除Redis中的缓存(设置为立即过期！)
			Long id = wms.getId();
			jedisClient.expire("MAP_ITEM:"+id, 0);
			
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@Override
	public MapResult deleteWMS(Long[] ids) {
		
		try {
			for (Long id : ids) {
				//删除指定的Id的图层
				wmsMapper.deleteByPrimaryKey(id);
				
				//删除Redis中的缓存(设置为立即过期！)
				jedisClient.expire("MAP_ITEM:"+id, 0);
				
				TbWmsLayersExample example = new TbWmsLayersExample();
				Criteria criteria = example.createCriteria();
				criteria.andWmsidEqualTo(id);
				List<TbWmsLayers> result = wmsLayerMapper.selectByExample(example);
				//如果wms服务有图层，则删除图层信息和Solr中的索引信息
				if(result!=null && result.size()>0){
					
					Long[] layerIds = new Long[result.size()];
					for(int i =0;i<result.size();i++){
						layerIds[i] = result.get(i).getId();
					}
					//删除此WMS对应的所有图层数据，删除Solr中的索引！
					wmsLayerService.deleteWMSLayers(layerIds);
				}
				
			}
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
