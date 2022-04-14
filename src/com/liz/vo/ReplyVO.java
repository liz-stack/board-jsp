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
public class ReplyVO {

	private int replyNo;
	private String replyContent;
	private Date replyDate;
	
	
}
