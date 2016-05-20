package com.lmars.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.manage.service.WMSLayerService;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.search.service.MapLayerService;

@Controller
@RequestMapping("/wms")
public class WMSLayerController {

	@Autowired
	private WMSLayerService wmsLayerService;
	
	@Autowired
	private MapLayerService mapLayerService;
	
	
	@RequestMapping("/layer/list")
	@ResponseBody
	public EasyUIDataGridResult getWMSLayerList(Integer page, Integer rows){
		EasyUIDataGridResult result = wmsLayerService.getWMSLayerList(page, rows);
		return result;
	}
	
	@RequestMapping("/layer/layerEdit")
	public String showLayerEditPage(){
		return "wmsLayerEdit";
	}
	
	@RequestMapping("/layer/update")
	@ResponseBody
	public MapResult updateWMSLayer(TbWmsLayers wmsLayer){

		//更新图层信息到数据库中
		MapResult result = wmsLayerService.updateWMSLayer(wmsLayer);
		
		//更新图层索引库中信息
		mapLayerService.updateWMSLayerIndex(wmsLayer);
		
		return result;
	}
	
	@RequestMapping("/layer/delete")
	@ResponseBody
	public MapResult deleteWMSLayer(Long[] ids){
		
		//从数据库中删除数据,从Solr中删除索引
		MapResult result = wmsLayerService.deleteWMSLayers(ids);
		
		return result;
		
	}
}
