package com.lmars.search.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * MapService中documentInfo信息POJO类
 */
public class MapServiceDocumentInfo {
	@JsonProperty("Title")
	private String Title;
	@JsonProperty
	private String Author;
	@JsonProperty
	private String Comments;
	@JsonProperty
	private String Subject;
	@JsonProperty
	private String Category;
	@JsonProperty
	private String AntialiasingMode;
	@JsonProperty
	private String TextAntialiasingMode;
	@JsonProperty
	private String Keywords;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getAntialiasingMode() {
		return AntialiasingMode;
	}

	public void setAntialiasingMode(String antialiasingMode) {
		AntialiasingMode = antialiasingMode;
	}

	public String getTextAntialiasingMode() {
		return TextAntialiasingMode;
	}

	public void setTextAntialiasingMode(String textAntialiasingMode) {
		TextAntialiasingMode = textAntialiasingMode;
	}

	public String getKeywords() {
		return Keywords;
	}

	public void setKeywords(String keywords) {
		Keywords = keywords;
	}

	@Override
	public String toString() {
		return "MapServiceDocumentInfo [Title=" + Title + ", Author=" + Author + ", Comments=" + Comments + ", Subject="
				+ Subject + ", Category=" + Category + ", AntialiasingMode=" + AntialiasingMode
				+ ", TextAntialiasingMode=" + TextAntialiasingMode + ", Keywords=" + Keywords + "]";
	}


}
