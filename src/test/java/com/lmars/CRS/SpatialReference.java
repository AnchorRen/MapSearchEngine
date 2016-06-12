package com.lmars.CRS;

public class SpatialReference {

	private String wkid;
	private String latestWkid;
	private String vcsWkid;
	private String latestVcsWkid;
	private String cs;
	private String wkt;
	
	public String getWkt() {
		return wkt;
	}
	public void setWkt(String wkt) {
		this.wkt = wkt;
	}
	public String getCs() {
		return cs;
	}
	public void setCs(String cs) {
		this.cs = cs;
	}
	public String getVcsWkid() {
		return vcsWkid;
	}
	public void setVcsWkid(String vcsWkid) {
		this.vcsWkid = vcsWkid;
	}
	public String getLatestVcsWkid() {
		return latestVcsWkid;
	}
	public void setLatestVcsWkid(String latestVcsWkid) {
		this.latestVcsWkid = latestVcsWkid;
	}
	public String getWkid() {
		return wkid;
	}
	public void setWkid(String wkid) {
		this.wkid = wkid;
	}
	public String getLatestWkid() {
		return latestWkid;
	}
	public void setLatestWkid(String latestWkid) {
		this.latestWkid = latestWkid;
	}
	@Override
	public String toString() {
		return "SpatialReference [wkid=" + wkid + ", latestWkid=" + latestWkid + ", vcsWkid=" + vcsWkid
				+ ", latestVcsWkid=" + latestVcsWkid + ", cs=" + cs + ", wkt=" + wkt + "]";
	}
	
}
