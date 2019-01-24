package com.target.services;

import org.springframework.http.ResponseEntity;

import com.target.vo.Comment;

public interface DataAnalyzerService {
	/**
	 * 
	 * @param comment
	 * @return
	 */
	public ResponseEntity<?> analyzeContetntForObjectionalWords(Comment comment);
}
