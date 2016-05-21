package com.lmars.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 后台管理页面显示Controller
 * @author Administrator
 *
 */
@Controller
public class ManageController {

	/**
	 * 显示后台管理页面
	 * @return
	 */
	@RequestMapping("/manage")
	public String showManage(){
		
		return "manage"; 
	}
	/**
	 * 左侧和Tree结点和对应页面显示
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}") //EasyUI 中Tree菜单点击对应的事件
	public String showPage(@PathVariable String page){
		return page;
	}
}
