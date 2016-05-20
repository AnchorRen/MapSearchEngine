package com.lmars.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.manage.service.MapServiceLayerService;
import com.lmars.mapper.TbMapserviceLayersMapper;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbMapserviceLayersExample;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;
import com.lmars.search.service.MapLayerService;
@Service
public class MapServiceLayerServiceImpl implements MapServiceLayerService {

	@Autowired
	private TbMapserviceLayersMapper mapServiceLayerMapper;
	
	@Autowired
	private MapLayerService mapLayerService;
	
	@Override
	public EasyUIDataGridResult getMapServiceLayerList(int page, int rows) {
		
		//分页处理
		PageHelper.startPage(page, rows);
		
		TbMapserviceLayersExample example = new TbMapserviceLayersExample();
		//执行查询
		List<TbMapserviceLayers> list = mapServiceLayerMapper.selectByExampleWithBLOBs(example);
		//获取分页信息
		
		PageInfo<TbMapserviceLayers> pageInfo = new PageInfo<>(list);
		//返回查询结果
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	}

	@Override
	public MapResult updateMapServiceLayer(TbMapserviceLayers Layer) {
		try {
			//更新数据库
			int result = mapServiceLayerMapper.updateByPrimaryKeyWithBLOBs(Layer);
			//更新图层索引库中信息
			mapLayerService.updateMapServiceLayerIndex(Layer);
			
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@Override
	public MapResult deleteMapServiceLayers(Long[] ids) {
		
		try {
			for (Long id : ids) {
				//删除所用指定的Id的图层
				mapServiceLayerMapper.deleteByPrimaryKey(id);
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
