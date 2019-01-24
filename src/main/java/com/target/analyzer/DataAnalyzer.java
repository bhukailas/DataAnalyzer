package com.target.analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.target.vo.Comment;
import com.target.vo.CommentAnalysis;

@Component
public class DataAnalyzer {
	private String delimiter = " ";
	
	@Autowired
	private WordDictioanry badWordsDict;
	
	public DataAnalyzer() {
		
	}
	
	public DataAnalyzer(String delimiter, WordDictioanry badWordsDict) {
		this.delimiter = delimiter;
		this.badWordsDict = badWordsDict;
	}
	
	public CommentAnalysis hasObjectionableContent(Comment comment) {
		String body = comment.getBody();
		List<String> badWords = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(body, delimiter);
		
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			if(badWordsDict.find(word)) {
				badWords.add(word);
			}
		}
		
		CommentAnalysis analysis = new CommentAnalysis();
		analysis.setObjectinalWords(badWords);
		analysis.setMessage("Comment has objectionalWords");
		return new CommentAnalysis();
	}
}
