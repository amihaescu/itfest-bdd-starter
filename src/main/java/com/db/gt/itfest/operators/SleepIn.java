package com.db.gt.itfest.operators;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

class SleepIn {

    private DayOfWeek dayOfWeek;
    private boolean vacation;
    private List<DayOfWeek> workDays = Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY);

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

    boolean isSleepInPermitted() {
        return vacation || !workDays.contains(dayOfWeek);
    }
}
