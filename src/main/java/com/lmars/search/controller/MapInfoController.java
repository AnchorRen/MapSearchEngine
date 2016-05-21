package com.lmars.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmars.search.pojo.ServiceItem;
import com.lmars.search.service.MapInfoService;

/*
 * 查询服务详细信息Controller
 */
@Controller
public class MapInfoController {

	@Autowired
	private MapInfoService mapInfoService;
	
	/**
	 * 服务详细信息显示
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/service/{id}")
	public String showMapInfo(@PathVariable Long id,Model model){
		ServiceItem mapInfo = mapInfoService.getMapInfo(id);
		model.addAttribute("mapInfo", mapInfo);
		return "mapInfo";
	}
}
