package com.db.gt.itfest.string;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringManipSteps {

    private StringManipulation stringManipulation;
    private String result;
    private Boolean found;


    @Given("^I have the string: (.*)")
    public void initialize(String input){
        stringManipulation = new StringManipulation(input);
    }

    @When("I search for the chars between position (\\d+) and (\\d+)")
    public void subString(int from, int to){
        result = stringManipulation.getSubString(from, to);
    }

    @When("I search for the string (.*)")
    public void stringInString(String s){
        found = stringManipulation.find(s);
    }

    @When("I change the front to back")
    public void frontToBack(){
        result = stringManipulation.frontBack();
    }

    @Then("^I expect to get the following char sequence: (.*)")
    public void expectSubString(String expected){
        assertEquals(expected.replace(", ",""), result);
    }

    @Then("I expect (.*) find it")
    public void expectStringInString(String findable){
        if (findable.equals("to")){
            assertTrue(found);
        } else if (findable.equals("not to")){
            assertFalse(found);
        }
    }

    @Then("I expect the following string: (.*)")
    public void checkFrontToBack(String frontBack){
        assertEquals(frontBack, result);
    }



}
