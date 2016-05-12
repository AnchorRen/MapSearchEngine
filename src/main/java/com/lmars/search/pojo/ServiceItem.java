package com.lmars.search.pojo;
/*
 * 服务详细信息POJO包装类
 */

import java.util.List;

import com.lmars.pojo.TbWmsContact;

public class ServiceItem {

	private ServiceInfo serviceInfo;
	private List<Layer> layers;
	private DocumentInfo documentInfo;
	private TbWmsContact wmsContact;

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public List<Layer> getLayers() {
		return layers;
	}

	public void setLayers(List<Layer> layers) {
		this.layers = layers;
	}

	public DocumentInfo getDocumentInfo() {
		return documentInfo;
	}

	public void setDocumentInfo(DocumentInfo documentInfo) {
		this.documentInfo = documentInfo;
	}

	public TbWmsContact getWmsContact() {
		return wmsContact;
	}

	public void setWmsContact(TbWmsContact wmsContact) {
		this.wmsContact = wmsContact;
	}

}
