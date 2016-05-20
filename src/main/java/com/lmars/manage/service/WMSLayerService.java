package com.lmars.manage.service;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.pojo.TbWmsLayers;

public interface WMSLayerService {

	/**
	 * 获取wms layer 列表
	 */
	public EasyUIDataGridResult getWMSLayerList(int page,int rows);
	
	/**
	 * 更新图层
	 */
	public MapResult updateWMSLayer(TbWmsLayers wmsLayer);
	/**
	 * 删除WMS图层（多个）
	 */
	public MapResult deleteWMSLayers(Long [] ids);
}
