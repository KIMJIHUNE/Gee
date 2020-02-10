package com.example.demo.vo;

import org.apache.ibatis.type.Alias;

@Alias("tvo")
public class TBoardVO {
	private int num;
	private String title, content, tdate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
}
