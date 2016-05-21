package com.lmars.manage.service;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.pojo.TbMapserviceLayers;
/**
 * MapService图层管理Service
 * @author Administrator
 *
 */
public interface MapServiceLayerService {

	/**
	 * 获取wms layer 列表
	 */
	public EasyUIDataGridResult getMapServiceLayerList(int page,int rows);
	
	/**
	 * 更新图层
	 */
	public MapResult updateMapServiceLayer(TbMapserviceLayers Layer);
	/**
	 * 删除WMS图层（多个）
	 */
	public MapResult deleteMapServiceLayers(Long [] ids);
}
