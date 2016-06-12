package com.lmars.search.pojo;
/*
 * 检索库中一条记录的POJO类
 */
public class SearchItem {

	private String id;
	private String serviceId;
	private String mapName;
	private String mapTitle;
	private String mapDesc;
	private String images;

	
	public String getMapTitle() {
		return mapTitle;
	}

	public void setMapTitle(String mapTitle) {
		this.mapTitle = mapTitle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getMapDesc() {
		return mapDesc;
	}

	public void setMapDesc(String mapDesc) {
		this.mapDesc = mapDesc;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "{'id:'" + id + ", 'serviceId':" + serviceId + ", 'mapName':" + mapName + ", 'mapDesc':" + mapDesc
				+ ", 'images':" + images + "}";
	}

	
}
