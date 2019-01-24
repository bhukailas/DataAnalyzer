package com.target.analyzer;

import org.springframework.stereotype.Component;

@Component
public class DataTransformerImpl implements DataTransformer {

	@Override
	public String transform(String content) {
		return content;
	}

}
