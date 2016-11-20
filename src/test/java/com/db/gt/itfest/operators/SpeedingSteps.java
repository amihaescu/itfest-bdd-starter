package com.db.gt.itfest.operators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SpeedingSteps {

    private Speeding speeding;
    private int result;

    @Given("I am cruising along at (\\d+) miles per hour")
    public void setSpeed(Integer speed){
        speeding = new Speeding(speed);
    }

    @And("It's (.*) my birthday")
    public void setBirthday(String not){
        speeding.setYourBirthday(!"not".equals(not));
    }

    @When("the cops pull me over")
    public void copsPullMeOver(){
        result = speeding.getFine();
    }

    @Then("I get (.*) fine")
    public void getFine(String fineType){
        switch (fineType){
            case "no":
                assertEquals(0, result);
                break;
            case "small":
                assertEquals(1, result);
                break;
            case "big":
                assertEquals(2, result);
                break;
            default:
                assertNotEquals(0, result);
        }
    }
}
