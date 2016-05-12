package com.lmars.search.mapper;

import java.util.List;

import com.lmars.search.pojo.SearchItem;
/*
 * MyBatis 映射类
 */
public interface ItemMapper {

	List<SearchItem> getWMSItemList();
	
	List<SearchItem> getMapServiceItemList();
}
