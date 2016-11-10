package com.db.gt.itfest.string;

class StringManipulation {

    private String string;

    StringManipulation(String string) {
        this.string = string;
    }

    String getSubString(int from, int to) {
        return string.substring(from, to);
    }

    Boolean find(String input){
        return string.contains(input);
    }
}
