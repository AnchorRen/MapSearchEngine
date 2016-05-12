package com.lmars.search.service;

import com.lmars.common.pojo.MapResult;

public interface MapLayerService {
	/*
	 * 导入全部WMS图层到索引库
	 */
	public MapResult importWMSLayers() throws Exception;
	/*
	 * 导入全部MapService图层到索引库
	 */
	public MapResult importMapServiceLayers() throws Exception;
}
