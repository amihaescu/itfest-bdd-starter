package com.db.gt.itfest.numbers;

import java.util.List;

class Average {

    private List<Integer> array;

    Average(List<Integer> array) {
        this.array = array;
    }

    float calculate() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return ((float) sum / array.size());
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     */
    public boolean arrayFrontNine() {
        int end = array.size();
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (array.get(i) == 9) return true;
        }

        return false;
    }
}
