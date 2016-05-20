package com.lmars.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.manage.service.WMSLayerService;
import com.lmars.mapper.TbWmsLayersMapper;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;
import com.lmars.search.service.MapLayerService;
@Service
public class WMSLayerServiceImpl implements WMSLayerService{

	@Autowired
	private TbWmsLayersMapper wmsLayerMapper;
	
	@Autowired
	private MapLayerService mapLayerService;
	
	@Override
	public MapResult updateWMSLayer(TbWmsLayers wmsLayer) {


		Long id = wmsLayer.getId();
		try {
			int result = wmsLayerMapper.updateByPrimaryKeyWithBLOBs(wmsLayer);
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@Override
	public EasyUIDataGridResult getWMSLayerList(int page, int rows) {

		//分页处理
		PageHelper.startPage(page, rows);
		
		TbWmsLayersExample example = new TbWmsLayersExample();
		//执行查询
		List<TbWmsLayers> list = wmsLayerMapper.selectByExampleWithBLOBs(example);
		//获取分页信息
		
		PageInfo<TbWmsLayers> pageInfo = new PageInfo<>(list);
		//返回查询结果
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	}

	@Override
	public MapResult deleteWMSLayers(Long[] ids) {

		try {
			for (Long id : ids) {
				//删除所用指定的Id的图层
				wmsLayerMapper.deleteByPrimaryKey(id);
				//删除每一个Id对应在Solr中的索引
				mapLayerService.deleteLayerIndex(id);
			}
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
		
	}

}
