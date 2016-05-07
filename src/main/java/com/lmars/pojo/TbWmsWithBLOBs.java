package com.lmars.pojo;

public class TbWmsWithBLOBs extends TbWms {
    private String abstracts;

    private String keywords;

    private String fees;

    private String access;

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees == null ? null : fees.trim();
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access == null ? null : access.trim();
    }
}