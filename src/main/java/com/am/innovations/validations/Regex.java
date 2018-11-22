package com.am.innovations.validations;

public interface Regex {
	String NON_ALPHA_NUMERIC_SPACE = "[^A-Za-z0-9 ]";

	interface Mobile {
		String TEN_DIGIT = "^[0-9]{10}";
	}
}
