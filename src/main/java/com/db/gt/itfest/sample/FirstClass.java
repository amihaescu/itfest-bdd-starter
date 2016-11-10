package com.db.gt.itfest.sample;

class FirstClass {

    private String string;

    FirstClass(String input){
        this.string = input;
    }

    String getUpperCaseString(){
        return string.toUpperCase();
    }

    String getLowerCaseString(){
        return string.toLowerCase();
    }
}
