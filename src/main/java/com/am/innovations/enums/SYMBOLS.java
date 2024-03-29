package com.am.innovations.enums;

// All Symbols
public enum SYMBOLS {

    UNDERSCORE("_", "_"), SPACE(" ", " "), COLON(":", ":"), SLASH("/", "/"), DOT(".", "\\."), BACKSLASH("\\",
            "\\"), PIPE("|", "\\|"), FORWARD_SLASH("/",
                    "\\/"), QUESTION_MARK("?", "\\?"), SEMI_COLON(";", ";"), EQUALS("=", "="),HYPHEN("-", "-");

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
