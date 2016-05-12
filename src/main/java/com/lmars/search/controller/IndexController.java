package com.lmars.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
/**
 * 首页展示Controller
 *
 */
public class IndexController {

	@RequestMapping("/index")
	public String showIndex(){
		return "index";
	}
}
