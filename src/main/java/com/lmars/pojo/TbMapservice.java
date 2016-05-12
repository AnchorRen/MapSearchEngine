package com.lmars.pojo;

public class TbMapservice {
    private Long id;

    private String mapserviceurl;

    private String currentversion;

    private String mapname;

    private String singlefusedmapcache;

    private String initialextend;

    private String fullextend;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMapserviceurl() {
        return mapserviceurl;
    }

    public void setMapserviceurl(String mapserviceurl) {
        this.mapserviceurl = mapserviceurl == null ? null : mapserviceurl.trim();
    }

    public String getCurrentversion() {
        return currentversion;
    }

    public void setCurrentversion(String currentversion) {
        this.currentversion = currentversion == null ? null : currentversion.trim();
    }

    public String getMapname() {
        return mapname;
    }

    public void setMapname(String mapname) {
        this.mapname = mapname == null ? null : mapname.trim();
    }

    public String getSinglefusedmapcache() {
        return singlefusedmapcache;
    }

    public void setSinglefusedmapcache(String singlefusedmapcache) {
        this.singlefusedmapcache = singlefusedmapcache == null ? null : singlefusedmapcache.trim();
    }

    public String getInitialextend() {
        return initialextend;
    }

    public void setInitialextend(String initialextend) {
        this.initialextend = initialextend == null ? null : initialextend.trim();
    }

    public String getFullextend() {
        return fullextend;
    }

    public void setFullextend(String fullextend) {
        this.fullextend = fullextend == null ? null : fullextend.trim();
    }
}