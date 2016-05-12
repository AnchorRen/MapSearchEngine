package com.lmars.search.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentInfo {

	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Author")
	private String author;
	
	@JsonProperty("Comments")
	private String comments;
	
	@JsonProperty("Subject")
	private String subject;
	
	@JsonProperty("Category")
	private String category;
	
	@JsonProperty("AntialiasingMode")
	private String antialiasingMode;
	
	@JsonProperty("TextAntialiasingMode")
	private String textAntialiasingMode;
	
	@JsonProperty("Keywords")
	private String keywords;
	
	
	@Override
	public String toString() {
		return "DocumentInfo [title=" + title + ", author=" + author + ", comments=" + comments + ", subject=" + subject
				+ ", category=" + category + ", antialiasingMode=" + antialiasingMode + ", textAntialiasingMode="
				+ textAntialiasingMode + ", keywords=" + keywords + "]";
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAntialiasingMode() {
		return antialiasingMode;
	}

	public void setAntialiasingMode(String antialiasingMode) {
		this.antialiasingMode = antialiasingMode;
	}

	public String getTextAntialiasingMode() {
		return textAntialiasingMode;
	}

	public void setTextAntialiasingMode(String textAntialiasingMode) {
		this.textAntialiasingMode = textAntialiasingMode;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}
