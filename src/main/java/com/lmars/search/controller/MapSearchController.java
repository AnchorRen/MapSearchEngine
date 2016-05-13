package com.lmars.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.search.pojo.SearchResult;
import com.lmars.search.service.MapSearchService;
/**
 * 关键字搜索Controller
 * @author bruce
 *
 */
@Controller
public class MapSearchController {

	@Autowired
	private MapSearchService mapSearchService;
	
	@RequestMapping("/q")
	public String search(@RequestParam(defaultValue="")String keywords,
			@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="15")Integer rows,
			Model model) throws Exception{
		
			SearchResult searchResult = mapSearchService.search(keywords, page, rows);
			
			//参数传递 给页面
			model.addAttribute("query", keywords);
			model.addAttribute("totalPages", searchResult.getPageCount());
			model.addAttribute("itemList", searchResult.getItemList());
			model.addAttribute("page", searchResult.getCurPage());
			
			//返回逻辑视图
			return "list2";
	}
}
