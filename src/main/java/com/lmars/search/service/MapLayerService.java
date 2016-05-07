package com.lmars.search.service;

import com.lmars.common.pojo.MapResult;

public interface MapLayerService {

	public MapResult importWMSLayers() throws Exception;
	public MapResult importMapServiceLayers() throws Exception;
}
