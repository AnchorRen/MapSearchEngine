package com.lmars.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.search.service.MapLayerService;

@Controller
public class MapLayerController {

	@Autowired
	private MapLayerService mapLayerService;
	
	/**
	 * 导入WMS 图层到索引库中
	 * @return
	 */
	@RequestMapping("/importwms")
	@ResponseBody
	public MapResult importWms(){
		
		try {
			MapResult result = mapLayerService.importWMSLayers();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	/**
	 * 导入MapService 图层到索引库中
	 * @return
	 */
	@RequestMapping("/importmapservice")
	@ResponseBody
	public MapResult importMapservice(){
		
		try {
			MapResult result = mapLayerService.importMapServiceLayers();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
