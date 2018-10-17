package com.am.innovations.validations;

public enum Symbol {

	UNDERSCORE("_"), SPACE(" "), COLON(":");

	String val;

	Symbol(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
