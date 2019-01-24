package com.target.analyzer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class WordsDictionaryImpl implements WordDictioanry {
	TrieNode root = new TrieNode();
	
	{
		this.addWord("worst");
		this.addWord("bad");
	}
	
	static class TrieNode {
		boolean endOfWord;
		Map<Character, TrieNode> children = new HashMap<>();
		
		public boolean find(String str) {
			str = str.toLowerCase();
			TrieNode curr = this;
			for(int i=0; i<str.length(); i++) {
				if(curr.children.containsKey(str.charAt(i))) {
					curr = curr.children.get(str.charAt(i));
					if(i == str.length()-1 && curr.endOfWord) {
						return true;
					}
				} else {
					return false;
				}
			}			
			return false;
		}
		
		public void insert(String str) {
			str = str.toLowerCase();
			TrieNode curr = this;
			for(int i=0; i<str.length(); i++) {
				if(!curr.children.containsKey(str.charAt(i))) {
					curr.children.put(str.charAt(i), new TrieNode());
				}
				curr = curr.children.get(str.charAt(i));
			}
			curr.endOfWord = true;
		}	
	}
	
	public boolean find(String word) {
		return root.find(word);
	}
	
	public void addWord(String word) {
		root.insert(word);
	}
}
