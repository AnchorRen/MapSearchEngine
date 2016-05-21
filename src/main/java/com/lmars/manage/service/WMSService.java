package com.lmars.manage.service;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.pojo.TbWmsWithBLOBs;
/**
 * WMS 服务管理Service
 * @author Administrator
 *
 */
public interface WMSService {

	/**
	 * 获取wms列表
	 */
	public EasyUIDataGridResult getWMSList(int page,int rows);
	
	/**
	 * 更新WMS服务信息
	 */
	public MapResult updateWMSLayer(TbWmsWithBLOBs wms);
	/**
	 * 删除WMS服务（一个或者多个）
	 */
	public MapResult deleteWMS(Long [] ids);
}
