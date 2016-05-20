package com.lmars.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {

	@RequestMapping("/manage")
	public String showManage(){
		
		return "manage"; 
	}
	
	@RequestMapping("/{page}") //EasyUI 中Tree菜单点击对应的事件
	public String showPage(@PathVariable String page){
		return page;
	}
}
