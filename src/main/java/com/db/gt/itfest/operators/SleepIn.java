package com.db.gt.itfest.operators;

import java.time.DayOfWeek;

class SleepIn {

    private DayOfWeek dayOfWeek;
    private boolean vacation;

    SleepIn() {
    }

    public SleepIn(DayOfWeek dayOfWeek, boolean vacation) {
        this.dayOfWeek = dayOfWeek;
        this.vacation = vacation;
    }

    void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    /**
     * Method returns true if sleep is permitted given the conditions: day of week and whether I am on vacation
     */
    boolean isSleepInPermitted() {
        throw new RuntimeException();
    }
}
