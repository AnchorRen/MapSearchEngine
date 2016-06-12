package com.lmars.search.pojo;
/**
 * WMS图层初始化参数类
 * @author REN
 *
 */
public class InitialVisualLayer {

	private String crs; //坐标系
	
	private double sourthLatitude;
	private double westLongitude;
	private double northLatitude;
	private double eastLongitude;
	public String getCrs() {
		return crs;
	}
	public void setCrs(String crs) {
		this.crs = crs;
	}
	public double getSourthLatitude() {
		return sourthLatitude;
	}
	public void setSourthLatitude(double sourthLatitude) {
		this.sourthLatitude = sourthLatitude;
	}
	public double getWestLongitude() {
		return westLongitude;
	}
	public void setWestLongitude(double westLongitude) {
		this.westLongitude = westLongitude;
	}
	public double getNorthLatitude() {
		return northLatitude;
	}
	public void setNorthLatitude(double northLatitude) {
		this.northLatitude = northLatitude;
	}
	public double getEastLongitude() {
		return eastLongitude;
	}
	public void setEastLongitude(double eastLongitude) {
		this.eastLongitude = eastLongitude;
	}
	
	
	
}
