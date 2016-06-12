package com.lmars.search.pojo;
/**
 * 使用Leaflet可视化，需要传递图层需要的参数类
 * @author REN
 *
 */
public class VisualLayer {

	private Integer layerId;
	private String name;
	public Integer getLayerId() {
		return layerId;
	}
	public void setLayerId(Integer integer) {
		this.layerId = integer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
