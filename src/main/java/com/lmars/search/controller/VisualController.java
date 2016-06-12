package com.lmars.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmars.common.pojo.MapResult;
import com.lmars.search.service.VisualLayerService;
/**
 * 图层可视化参数Controller
 * @author REN
 * @date 2016年6月9日 下午9:59:09
 */
@Controller
public class VisualController {

	@Autowired
	private VisualLayerService layerService;
	
	/**
	 * 获取服务对应图层的可视化参数
	 * @param id
	 * @return
	 */
	@RequestMapping("/visual/{id}")
	@ResponseBody
	public MapResult getVisualParam(@PathVariable Long id){
		MapResult result = layerService.getVisualParam(id);
		return result;
	}
	/**
	 * 获得WMS初始范围参数
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("/initial/{id}/{name}")
	@ResponseBody
	public MapResult getInitialLayerParams(@PathVariable Long id,@PathVariable String name){
		MapResult result = layerService.getWMSInitialLayerParams(id, name);
		return result;
	}
}
