package com.am.innovations.validations;

public enum SYMBOLS {

    UNDERSCORE("_"), SPACE(" "), COLON(":"), SLASH("/");

    String val;

    SYMBOLS(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

}
