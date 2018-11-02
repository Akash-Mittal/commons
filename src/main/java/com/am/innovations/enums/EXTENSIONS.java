package com.am.innovations.enums;

public enum EXTENSIONS {

	CSV("Comma Seperated Values", "csv"), TXT("Text File", "txt");

	String description;
	String extension;

	private EXTENSIONS(String description, String extension) {
		this.description = description;
		this.extension = extension;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
