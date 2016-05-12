package com.lmars.pojo;

public class TbMapserviceWithBLOBs extends TbMapservice {
    private String servicedescription;

    private String copyrighttext;

    private String layers;

    private String documentinfo;

    public String getServicedescription() {
        return servicedescription;
    }

    public void setServicedescription(String servicedescription) {
        this.servicedescription = servicedescription == null ? null : servicedescription.trim();
    }

    public String getCopyrighttext() {
        return copyrighttext;
    }

    public void setCopyrighttext(String copyrighttext) {
        this.copyrighttext = copyrighttext == null ? null : copyrighttext.trim();
    }

    public String getLayers() {
        return layers;
    }

    public void setLayers(String layers) {
        this.layers = layers == null ? null : layers.trim();
    }

    public String getDocumentinfo() {
        return documentinfo;
    }

    public void setDocumentinfo(String documentinfo) {
        this.documentinfo = documentinfo == null ? null : documentinfo.trim();
    }
}