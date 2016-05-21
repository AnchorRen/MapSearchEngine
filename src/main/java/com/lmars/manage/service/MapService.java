package com.lmars.manage.service;

import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.pojo.TbMapserviceWithBLOBs;

/**
 * ArcGIS MapService管理Service
 * @author Administrator
 *
 */
public interface MapService {

	/**
	 * 获取MapService列表
	 */
	public EasyUIDataGridResult getMapServiceList(int page,int rows);
	
	/**
	 * 更新MapService服务信息
	 */
	public MapResult updateMapService(TbMapserviceWithBLOBs mapService);
	/**
	 * 删除MapService服务（一个或者多个）
	 */
	public MapResult deleteMapService(Long [] ids);
}
