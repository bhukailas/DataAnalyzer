package com.target.analyzer;

import java.util.HashMap;
import java.util.Map;

public class BadWordsDictionary implements WordDictioanry {
	TrieNode root = new TrieNode();
	
	static class TrieNode {
		boolean endOfWord;
		Map<Character, TrieNode> children = new HashMap<>();
		
		public boolean find(String str) {
			TrieNode current = this;
			for(int i=0; i<str.length(); i++) {
				
			}
			
			return false;
		}
		
		public void insert(String str) {

		}	
	}
	
	public boolean find(String word) {
		return root.find(word);
	}
	
	public void addWord(String word) {
		root.insert(word);
	}
}
