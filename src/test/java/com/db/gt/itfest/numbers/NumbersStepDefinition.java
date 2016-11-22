package com.db.gt.itfest.numbers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumbersStepDefinition {

    private Numbers numbers;
    private float result;
    private boolean isPresent;
    private Integer closerTo;

    @Given("^I have an numbers object with the values: (.*)")
    public void initialize(List<Integer> list) {
        numbers = new Numbers(list);
    }

    @Given("I have an numbers object with a=(\\d+) and b=(\\d+)")
    public void initialize(Integer a, Integer b){
        numbers = new Numbers(a, b);
    }

    @When("^I calculate the average")
    public void calculateAvg(){
        result = numbers.calculateAverage();
    }

    @When("I check if one of the first 4 elements in the array is a 9")
    public void checkNineIsPresent(){
        isPresent = numbers.arrayFrontNine();
    }

    @When("I check to see which one is closer to (\\d+)")
    public void check(Integer c){
        closerTo = numbers.closerTo(c);
    }

    @When("I check to see there are no triplets")
    public void checkTriplets(){
        isPresent = numbers.noTriples();
    }

    @Then("^I expect it to be (.*)")
    public void expectAvg(float expected){
        assertEquals(expected, result, 0.0001);
    }

    @Then("the result should be (.*)")
    public void expectBooleanResult(Boolean b){
        assertEquals(b, isPresent);
    }

    @Then("the closer one should be (\\d+)")
    public void expectTheCloserOne(Integer closerOne){
        assertEquals(closerOne, closerTo);
    }
}
