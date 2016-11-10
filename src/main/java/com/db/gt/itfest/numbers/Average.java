package com.db.gt.itfest.numbers;

import java.util.List;

class Average {

    private List<Integer> array;

    Average(List<Integer> array) {
        this.array = array;
    }

    float calculate(){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return ((float) sum / array.size());
    }
}
