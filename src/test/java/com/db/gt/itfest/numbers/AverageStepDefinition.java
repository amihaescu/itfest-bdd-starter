package com.db.gt.itfest.numbers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AverageStepDefinition {

    private Average average;
    private float result;

    @Given("^I have an average object with the values: (.*)")
    public void initialize(List<Integer> list) {
        average = new Average(list);
    }

    @When("^I calculate the average")
    public void calculateAvg(){
        result = average.calculate();
    }

    @Then("^I expect it to be (.*)")
    public void expectAvg(float expected){
        assertEquals(expected, result, 0.0001);
    }
}
