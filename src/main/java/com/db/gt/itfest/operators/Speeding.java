package com.db.gt.itfest.operators;

public class Speeding {

    private int speed;
    private boolean isYourBirthday;

    public Speeding(int speed) {
        this.speed = speed;
    }

    public void setYourBirthday(boolean yourBirthday) {
        isYourBirthday = yourBirthday;
    }

    int getFine(){
        return 0;
    }


}
