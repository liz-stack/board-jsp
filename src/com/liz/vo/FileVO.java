package com.liz.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
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
