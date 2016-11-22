package com.db.gt.itfest.string;

class StringManipulation {

    private String string;

    StringManipulation(String string) {
        this.string = string;
    }

    String getSubString(int from, int to) {
        return string.substring(from, to);
    }

    Boolean find(String input) {
        return string.contains(input);
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     */
    String frontBack() {
        throw new RuntimeException();
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.
     */
    String frontThree() {
        throw new RuntimeException();
    }

    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     */
    boolean stringContainsE() {
        throw new RuntimeException();
    }
}
