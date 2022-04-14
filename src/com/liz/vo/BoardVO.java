package com.liz.vo;

import java.util.Date;

public class BoardVO {
	private int boardNo;
	private String category;
	private String userName;
	private int userNo;
	private String password;
	private String title;
	private String content;
	private Date createDate;
	private Date modifyDate;
	
	public BoardVO(int boardNo, String category, String userName, int userNo, String password, String title,
			String content, Date createDate, Date modifyDate) {
		super();
		this.boardNo = boardNo;
		this.category = category;
		this.userName = userName;
		this.userNo = userNo;
		this.password = password;
		this.title = title;
		this.content = content;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}
	
	public BoardVO() {
		super();
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
