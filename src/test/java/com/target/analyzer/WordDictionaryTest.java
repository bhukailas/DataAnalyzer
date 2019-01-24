package com.target.analyzer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordDictionaryTest {
	private WordDictioanry dict;
	
	@Before
	public void init() {
		dict = new WordsDictionaryImpl();
		dict.addWord("bad");
		dict.addWord("useless");
		dict.addWord("worst");
	}
	
	@Test
	public void test() {
		assertEquals(true, dict.find("worst"));
		assertEquals(true, dict.find("useless"));
		assertEquals(false, dict.find("hello"));
		assertEquals(false, dict.find("there"));
	}

}
