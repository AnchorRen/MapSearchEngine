package com.lmars.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.manage.service.MapServiceLayerService;
import com.lmars.pojo.TbMapserviceLayers;
/**
 * MapService Layer 编辑显示 controller
 * @author bruce
 *
 */
@Controller
@RequestMapping("/mapservice")
public class MapServiceLayerController {

	@Autowired
	private MapServiceLayerService service;
	
	/**
	 * 分页获取图层列表
	 * @param page 页数
	 * @param rows 行数
	 * @return
	 */
	@RequestMapping("/layer/list")
	@ResponseBody
	public EasyUIDataGridResult getLayerList(Integer page, Integer rows){
		EasyUIDataGridResult result = service.getMapServiceLayerList(page, rows);
		return result;
	}
	
	/**
	 * 显示MapService 图层编辑页面
	 * @return
	 */
	@RequestMapping("/layer/layerEdit")
	public String showLayerEditPage(){
		return "mapServiceLayerEdit";
	}
	
	/**
	 * mapService 图层更新
	 * @param wmsLayer 图层信息
	 * @return
	 */
	@RequestMapping("/layer/update")
	@ResponseBody
	public MapResult updateWMSLayer(TbMapserviceLayers wmsLayer){

		//更新图层信息到数据库中
		MapResult result = service.updateMapServiceLayer(wmsLayer);
		
		return result;
	}
	
	/**
	 * 根据id值删除图层
	 * @param ids id数组
	 * @return
	 */
	@RequestMapping("/layer/delete")
	@ResponseBody
	public MapResult deleteWMSLayer(Long[] ids){
		
		//从数据库中删除数据,从Solr中删除索引
		MapResult result = service.deleteMapServiceLayers(ids);
		
		return result;
		
	}
}
