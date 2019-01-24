package com.target.vo;

import java.util.List;

public class CommentAnalysis {
	private Comment comment;
	private List<String> objectinalWords;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public List<String> getObjectinalWords() {
		return objectinalWords;
	}
	public void setObjectinalWords(List<String> objectinalWords) {
		this.objectinalWords = objectinalWords;
	}
}
