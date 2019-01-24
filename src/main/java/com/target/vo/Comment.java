package com.target.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Comment {
	private String body;
	private int userId;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dateTime;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
}
