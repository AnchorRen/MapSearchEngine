package com.lmars.search.service;

import com.lmars.common.pojo.MapResult;

/**
 * 查询服务图层可视化参数Service
 * @author REN
 *
 */
public interface VisualLayerService {

	/**
	 * 通过服务Id查询所有图层信息
	 * @param id 服务id
	 * @return
	 */
	MapResult getVisualParam(Long id);
	/**
	 * 通过Id查询WMS初始化图层参数
	 * @param id
	 * @return
	 */
	MapResult getWMSInitialLayerParams(Long id,String layerName);
}
