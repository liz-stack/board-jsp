package com.liz.vo;

import java.util.Date;

public class BoardVO2 {
	private int board_no;
	private String category;
	private String user_name;
	private int user_no;
	private String password;
	private String title;
	private String content;
	private Date create_date;
	private Date modify_date;
	
	public BoardVO2(int board_no, String category, String user_name, int user_no, String password, String title,
			String content, Date create_date, Date modify_date) {
		super();
		this.board_no = board_no;
		this.category = category;
		this.user_name = user_name;
		this.user_no = user_no;
		this.password = password;
		this.title = title;
		this.content = content;
		this.create_date = create_date;
		this.modify_date = modify_date;
	}
	
	public BoardVO2() {
		super();
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getModify_date() {
		return modify_date;
	}

	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	
	
}
