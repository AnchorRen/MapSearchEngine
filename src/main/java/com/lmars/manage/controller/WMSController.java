package com.lmars.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.manage.service.WMSLayerService;
import com.lmars.manage.service.WMSService;
import com.lmars.pojo.TbWmsWithBLOBs;
/**
 * WMS服务管理Controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/wms")
public class WMSController {

	@Autowired
	private WMSService wmsService;
	
	
	/**
	 * 显示WMS服务列表
	 * @param page 页数
	 * @param rows 行数
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult showWMSList(Integer page, Integer rows){
		EasyUIDataGridResult result = wmsService.getWMSList(page, rows);
		return result;
	}
	
	/**
	 * 显示WMS服务编辑页面
	 * @return
	 */
	@RequestMapping("/wmsEdit")
	public String showWmsEditPage(){
		return "wmsEdit";
	}
	
	/**
	 * 更新WMS服务信息
	 * @param wms
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public MapResult updateWMS(TbWmsWithBLOBs wms){

		MapResult result = wmsService.updateWMSLayer(wms);
		
		return result;
	}
	
	/**
	 * 删除WMS服务（一个或者多个）
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public MapResult deleteWMS(Long[] ids){
		
		//从数据库中删除数据,从Solr中删除索引
		MapResult result = wmsService.deleteWMS(ids);
		return result;
		
	}

}
