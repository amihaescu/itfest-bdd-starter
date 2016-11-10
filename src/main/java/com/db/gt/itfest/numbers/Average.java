package com.db.gt.itfest.numbers;

import java.util.List;

public class Average {

    List<Integer> array;

    public Average(List<Integer> array) {
        this.array = array;
    }

    public float calculate(){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return ((float) sum / array.size());
    }
}
