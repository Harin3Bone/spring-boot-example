package com.tutorial.springboot.model;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class BasicResModel {

	private String message;
	
	private Object data;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public BasicResModel(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
	
}