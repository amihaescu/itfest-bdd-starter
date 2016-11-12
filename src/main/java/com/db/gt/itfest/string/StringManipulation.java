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

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * */
    String frontBack(){
        char[] chars = string.toCharArray();
        int last = chars.length - 1;
        char intermediate = chars[0];
        chars[0] = chars[last];
        chars[last] = intermediate;
        return new String(chars);
    }
}
