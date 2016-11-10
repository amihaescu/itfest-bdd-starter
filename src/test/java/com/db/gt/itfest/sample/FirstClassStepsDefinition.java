package com.db.gt.itfest.sample;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class FirstClassStepsDefinition {

    private FirstClass firstClass;
    private String result;

    @Given("^I have a First Class object initialized with value:(.*)$")
    public void initializeObject(String input){
        firstClass = new FirstClass(input);
    }

    @When("^I call upper string method$")
    public void callUpperMethod(){
        result = firstClass.getUpperCaseString();
    }

    @When("^I call lower string method$")
    public void callLowerMethod(){
        result = firstClass.getLowerCaseString();
    }

    @Then("^I get (.*)$")
    public void testMethod(String expected){
        assertEquals(expected, result);
    }



}
