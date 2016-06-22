package com.lmars.search.pojo;

import com.lmars.common.utils.JsonUtils;

/*
 * 服务图层信息POJO类
 */
public class Layer {
	
	private Long id;
	private String title;
	private String name;
	private String description;
	private String url;
	private int layerId;
	private String images;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public int getLayerId() {
		return layerId;
	}

	public void setLayerId(int layerId) {
		this.layerId = layerId;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Layer [title=" + title + ", name=" + name + ", description=" + description + ", url=" + url
				+ ", layerId=" + layerId + ", images=" + images + "]";
	}
}
