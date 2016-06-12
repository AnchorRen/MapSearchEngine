package com.lmars.search.pojo;

import java.util.List;

/**
 * Leaflet可视化所需参数类
 * @author REN
 *
 */
public class VisualParams {

	private String url;
	private List<VisualLayer> layers;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<VisualLayer> getLayers() {
		return layers;
	}
	public void setLayers(List<VisualLayer> layers) {
		this.layers = layers;
	}
	
	
}
