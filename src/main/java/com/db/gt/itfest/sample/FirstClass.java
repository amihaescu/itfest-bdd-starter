package com.db.gt.itfest.sample;

class FirstClass {

    private String string;

    FirstClass(String input) {
        this.string = input;
    }

    /**
     * Method returns the fully upper case version the the string
     */
    String getUpperCaseString() {
        throw new RuntimeException();
    }

    /**
     * Method returns the fully lower case version the the string
     */
    String getLowerCaseString() {
        throw new RuntimeException();
    }
}
