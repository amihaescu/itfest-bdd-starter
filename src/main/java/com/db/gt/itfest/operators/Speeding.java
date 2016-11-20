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

    int getFine(){
        if (speed <= 60){
            return 0;
        } else {
            if (isYourBirthday){
                if (speed <= 65)
                    return 0;
                if ((speed > 65) && (speed <= 85))
                        return 1;
                if (speed > 85)
                    return 2;
            } else {
                if (speed <=80)
                    return 1;
                if (speed > 80 )
                    return 2;
            }
        }
        return 0;
    }


}
