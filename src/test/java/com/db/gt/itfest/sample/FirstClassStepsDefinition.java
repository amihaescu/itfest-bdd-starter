package com.db.gt.itfest.sample;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class FirstClassStepsDefinition {

    private FirstClass firstClass;
    private String result;

    @Given("^I have a First Class object$")
    public void initializeObject(){
        firstClass = new FirstClass();
    }

    @When("^I call getString method$")
    public void callMethod(){
        result = firstClass.getString();
    }

    @Then("^I get (.*)$")
    public void testMethod(String expected){
        assertEquals(expected, result);
    }



}
