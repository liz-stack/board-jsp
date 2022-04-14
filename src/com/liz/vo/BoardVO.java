package com.liz.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
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
	
}
