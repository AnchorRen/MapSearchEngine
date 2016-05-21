package com.lmars.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.manage.service.MapService;
import com.lmars.pojo.TbMapserviceWithBLOBs;
import com.lmars.pojo.TbWmsWithBLOBs;
/**
 * MapServive服务管理Conroller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/mapservice")
public class MapServiceController {

	@Autowired
	private MapService mapService;
	
	/**
	 * 显示MapService服务列表
	 * @param page 页数
	 * @param rows 行数
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult showMapServiceList(Integer page, Integer rows){
		EasyUIDataGridResult result = mapService.getMapServiceList(page, rows);
		return result;
	}
	
	/**
	 * 显示MapService服务编辑页面
	 * @return
	 */
	@RequestMapping("/mapserviceEdit")
	public String showMapServiceEditPage(){
		return "mapServiceEdit";
	}
	
	/**
	 * 更新MapService服务信息
	 * @param service
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public MapResult updateMapService(TbMapserviceWithBLOBs service){

		MapResult result = mapService.updateMapService(service);
		
		return result;
	}
	
	/**
	 * 删除MapService服务（一个或者多个）
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public MapResult deleteMapService(Long[] ids){
		
		//从数据库中删除数据,从Solr中删除索引
		MapResult result = mapService.deleteMapService(ids);
		return result;
		
	}
}
