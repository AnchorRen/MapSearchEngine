package com.lmars.search.service;

import com.lmars.search.pojo.ServiceItem;

/*
 * 获取地图服务详细信息Service
 */
public interface MapInfoService {

	/*
	 * 根据服务的id查询详细信息（wms的id小于20000000，mapservice的大于这个数字，用于区分两种不同的服务）
	 */
	public  ServiceItem getMapInfo(Long id);
}
