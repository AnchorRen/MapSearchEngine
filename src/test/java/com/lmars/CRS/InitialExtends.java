package com.lmars.CRS;

public class InitialExtends {

	private double ymin;
	private double ymax;
	private double xmin;
	private double xmax;
	
	private SpatialReference spatialReference;

	public double getYmin() {
		return ymin;
	}

	public void setYmin(double ymin) {
		this.ymin = ymin;
	}

	public double getYmax() {
		return ymax;
	}

	public void setYmax(double ymax) {
		this.ymax = ymax;
	}

	public double getXmin() {
		return xmin;
	}

	public void setXmin(double xmin) {
		this.xmin = xmin;
	}

	public double getXmax() {
		return xmax;
	}

	public void setXmax(double xmax) {
		this.xmax = xmax;
	}

	public SpatialReference getSpatialReference() {
		return spatialReference;
	}

	public void setSpatialReference(SpatialReference spatialReference) {
		this.spatialReference = spatialReference;
	}

	@Override
	public String toString() {
		return "InitialExtends [ymin=" + ymin + ", ymax=" + ymax + ", xmin=" + xmin + ", xmax=" + xmax
				+ ", spatialReference=" + spatialReference + "]";
	}
	
	
}
