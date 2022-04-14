package com.liz.vo;

public class FileVO {

	private int fileNo;
	private String fileOriginName;
	private String fileChangeName;
	private String fileOriginPath;
	private String fileChangePath;
	
	public FileVO(int fileNo, String fileOriginName, String fileChangeName, String fileOriginPath,
			String fileChangePath) {
		super();
		this.fileNo = fileNo;
		this.fileOriginName = fileOriginName;
		this.fileChangeName = fileChangeName;
		this.fileOriginPath = fileOriginPath;
		this.fileChangePath = fileChangePath;
	}

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public String getFileOriginName() {
		return fileOriginName;
	}

	public void setFileOriginName(String fileOriginName) {
		this.fileOriginName = fileOriginName;
	}

	public String getFileChangeName() {
		return fileChangeName;
	}

	public void setFileChangeName(String fileChangeName) {
		this.fileChangeName = fileChangeName;
	}

	public String getFileOriginPath() {
		return fileOriginPath;
	}

	public void setFileOriginPath(String fileOriginPath) {
		this.fileOriginPath = fileOriginPath;
	}

	public String getFileChangePath() {
		return fileChangePath;
	}

	public void setFileChangePath(String fileChangePath) {
		this.fileChangePath = fileChangePath;
	}
	
	
}
