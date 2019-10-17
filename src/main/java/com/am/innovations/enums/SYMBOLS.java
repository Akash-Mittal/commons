package com.am.innovations.enums;

public enum SYMBOLS {

	UNDERSCORE("_", "_"), SPACE(" ", " "), COLON(":", ":"), SLASH("/", "/"), DOT(".", "\\."), BACKSLASH("\\", "\\"),
	PIPE("|", "\\|"), FORWARD_SLASH("/", "\\/");

	String val;
	String regexEqual;

	private SYMBOLS(String val, String regexEqual) {
		this.val = val;
		this.regexEqual = regexEqual;
	}

	public String getVal() {
		return val;
	}

	public String getRegexEqual() {
		return regexEqual;
	}

}
