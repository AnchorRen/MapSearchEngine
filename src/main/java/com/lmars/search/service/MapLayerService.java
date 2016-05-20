package com.lmars.search.service;

import com.lmars.common.pojo.MapResult;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbWmsLayers;

public interface MapLayerService {
	/**
	 * 导入全部WMS图层到索引库
	 */
	public MapResult importWMSLayers() throws Exception;
	/**
	 * 导入全部MapService图层到索引库
	 */
	public MapResult importMapServiceLayers() throws Exception;
	/**
	 * 更新一个WMS图层的索引信息
	 */
	public MapResult updateWMSLayerIndex(TbWmsLayers layer);
	/**
	 * 更新一个MapServive图层suoyin
	 */
	public MapResult updateMapServiceLayerIndex(TbMapserviceLayers layer);
	/**
	 * 删除一个图层的索引(WMS MapService通用)
	 * @throws Exception 
	 */
	public MapResult deleteLayerIndex(Long id) throws Exception;
}
