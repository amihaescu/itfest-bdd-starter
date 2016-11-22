package com.db.gt.itfest.numbers;

import java.util.List;

class Numbers {

    private List<Integer> array;
    private int a, b;

    Numbers(List<Integer> array) {
        this.array = array;
    }

    Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Calculate the average of elements in the array
     */
    float calculateAverage() {
        throw new RuntimeException();
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     */
    boolean arrayFrontNine() {
        throw new RuntimeException();
    }

    /**
     * Given the numbers a and b this method should return the number which is closer to
     * number passed in as a parameter. If the numbers a equally close the method should
     * return 0
     */
    int closerTo(Integer closer) {
        throw new RuntimeException();
    }

    /**
     * This method checks whether the array contains no triples - consecutive equal elements
     */
    boolean noTriples() {
        throw new RuntimeException();
    }
}
