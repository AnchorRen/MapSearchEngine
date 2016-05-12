package com.lmars.pojo;

public class TbMapserviceLayers {
	private Long id;

	private Long mapserviceid;

	private String layerurl;

	private String layername;

	private int layerid;

	private String images;

	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMapserviceid() {
		return mapserviceid;
	}

	public void setMapserviceid(Long mapserviceid) {
		this.mapserviceid = mapserviceid;
	}

	public String getLayerurl() {
		return layerurl;
	}

	public void setLayerurl(String layerurl) {
		this.layerurl = layerurl == null ? null : layerurl.trim();
	}

	public String getLayername() {
		return layername;
	}

	public void setLayername(String layername) {
		this.layername = layername == null ? null : layername.trim();
	}

	public int getLayerid() {
		return layerid;
	}

	public void setLayerid(int layerid) {
		this.layerid = layerid;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images == null ? null : images.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}