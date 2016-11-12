package com.db.gt.itfest.operators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.DayOfWeek;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SleepInSteps {

    private SleepIn sleepIn = new SleepIn();
    boolean isSleepInPermitted;

    @Given("^It is (.*)")
    public void setDayOfWeek(String dayOfWeek){
        sleepIn.setDayOfWeek(DayOfWeek.valueOf(dayOfWeek.toUpperCase()));
    }

    @And("^I am (.*) holiday$")
    public void setOnHoliday(String onHoliday){
        if (onHoliday.equals("on")){
            sleepIn.setVacation(true);
        } else if (onHoliday.equals("not on")){
            sleepIn.setVacation(false);
        }
    }

    @When("^I check if I can sleep in late$")
    public void checkSleepIn(){
        isSleepInPermitted = sleepIn.isSleepInPermitted();
    }

    @Then("I see that I (.*)")
    public void verifyResult(String sleep){
        if (sleep.equals("can")){
            assertTrue(isSleepInPermitted);
        } else {
            assertFalse(isSleepInPermitted);
        }
    }
}
