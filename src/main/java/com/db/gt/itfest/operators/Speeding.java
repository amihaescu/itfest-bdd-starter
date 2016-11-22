package com.db.gt.itfest.operators;

class Speeding {

    private int speed;
    private boolean isYourBirthday;

    Speeding(int speed) {
        this.speed = speed;
    }

    void setYourBirthday(boolean yourBirthday) {
        isYourBirthday = yourBirthday;
    }

    /**
     * Method return the type of fine I get(or not) given certain driving conditions: speed and whether it is my birthday
     * or not. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
     * If speed is 81 or more, the result is 2.Unless it is your birthday -- on that day, your speed can be 5 higher
     * in all cases.
     */
    int getFine() {
        throw new RuntimeException();
    }


}
