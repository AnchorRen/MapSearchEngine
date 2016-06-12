package com.lmars.search.pojo;

import com.lmars.common.utils.JsonUtils;

/*
 * 服务基本信息POJO类
 */
public class ServiceInfo {

	private Long id;
	private String url;
	private String title;
	private String abstracts;
	private String keywords;
	private String version;
	private String fees;
	private String access;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstracts() {
		return abstracts;
	}

	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	@Override
	public String toString() {
		return "{'url':'" + url + "', 'title':'" + title + "', 'abstracts':'" + abstracts + "', 'keywords':'" + keywords
				+ "', 'version':'" + version + "', 'fees':" + fees + "', 'access':'" + access + "'}";
	}
	/*@Override
	public String toString() {
		return JsonUtils.objectToJson(this);
	}*/
	
}
