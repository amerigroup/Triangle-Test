package com.tradeshift.Triangle;
public class MyException extends Exception {
	private String content;

	MyException(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		return content;
	}
}