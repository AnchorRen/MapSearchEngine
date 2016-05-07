package com.lmars.search.mapper;

import java.util.List;

import com.lmars.search.pojo.SearchItem;

public interface ItemMapper {

	List<SearchItem> getWMSItemList();
	
	List<SearchItem> getMapServiceItemList();
}
