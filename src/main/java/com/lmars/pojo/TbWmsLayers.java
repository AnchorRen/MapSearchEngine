package com.lmars.pojo;

public class TbWmsLayers {
    private Long id;

    private Long wmsid;

    private String title;

    private String name;

    private String url;

    private Integer currentid;

    private Integer parentid;

    private String images;

    private String boundingbox;

    private String abstracts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWmsid() {
        return wmsid;
    }

    public void setWmsid(Long wmsid) {
        this.wmsid = wmsid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getCurrentid() {
        return currentid;
    }

    public void setCurrentid(Integer currentid) {
        this.currentid = currentid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getBoundingbox() {
        return boundingbox;
    }

    public void setBoundingbox(String boundingbox) {
        this.boundingbox = boundingbox == null ? null : boundingbox.trim();
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }
}