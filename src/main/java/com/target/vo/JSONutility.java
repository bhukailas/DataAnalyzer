package com.target.vo;

import java.time.LocalDateTime;

import com.google.gson.Gson;

public class JSONutility {
	public static void main(String[] args) {
		Gson gson = new Gson();
		Comment comment = new Comment();
		comment.setBody("body of comment");
		comment.setUserId(1234);
		comment.setDateTime(LocalDateTime.now());
		System.out.println(gson.toJson(comment));
	}
}
