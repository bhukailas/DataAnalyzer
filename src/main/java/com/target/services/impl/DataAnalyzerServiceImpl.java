package com.target.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.target.analyzer.DataAnalyzer;
import com.target.services.DataAnalyzerService;
import com.target.vo.Comment;
import com.target.vo.CommentAnalysis;

@RestController
@RequestMapping("/api")
@Service
public class DataAnalyzerServiceImpl implements DataAnalyzerService {
	public static final Logger logger = LoggerFactory.getLogger(DataAnalyzerServiceImpl.class);
	
	@Autowired
	private Gson gson;
	
	@Autowired
	private DataAnalyzer analyzer;
	
	@RequestMapping(value = "/commentValidation", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<?> analyzeContetntForObjectionalWords(@RequestBody Comment comment) {
		logger.debug("Comment : {}", comment);
		CommentAnalysis analysis = analyzer.analyze(comment);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<CommentAnalysis>(analysis, headers, HttpStatus.OK);
	}

}
