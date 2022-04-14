package com.liz.vo;

import java.util.Date;

public class ReplyVO {

	private int replyNo;
	private String replyContent;
	private Date replyDate;
	
	public ReplyVO(int replyNo, String replyContent, Date replyDate) {
		super();
		this.replyNo = replyNo;
		this.replyContent = replyContent;
		this.replyDate = replyDate;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	
	
	
}
