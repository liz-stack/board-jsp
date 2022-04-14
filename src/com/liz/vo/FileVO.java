package com.liz.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FileVO {

	private int fileNo;
	private String fileOriginName;
	private String fileChangeName;
	private String fileOriginPath;
	private String fileChangePath;
	
}
