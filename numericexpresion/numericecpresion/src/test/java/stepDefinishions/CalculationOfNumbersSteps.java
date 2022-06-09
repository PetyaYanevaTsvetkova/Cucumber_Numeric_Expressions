package stepDefinishions;

import helpers.Calculator;
import helpers.DifferenceCalculatorHelper;
import helpers.SumCalculatorHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.runners.Parameterized;

public class CalculationOfNumbersSteps {
    Calculator calculator;
    private int calculationInts;
    private int expectedCalculationInts;
    private double calculationDoubles;
    private double expectedCalculationDoubles;

    @ParameterType("sum|difference")
    public Calculator calculation(String operation) {
        if (operation.equalsIgnoreCase("sum")) {
            return new SumCalculatorHelper();
        } else if (operation.equalsIgnoreCase("difference")) {
            return new DifferenceCalculatorHelper();
        }
        return null;
    }

    @Given("there is a {calculation} calculator")
    public void there_is_a_calculator(Calculator calculation) {
        calculator = calculation;
    }

    @Given("calculate sum/difference of int numbers {int} and {int}")
    public void calculateSumOfIntNumbers(int a, int b) {
        calculationInts = calculator.calculate(a, b);
    }

    @When("expected sum/difference input result is {int}")
    public void expectedSumInputResultIs(int resultInts) {
        expectedCalculationInts = resultInts;
    }

    @Then("check if the int sum/difference is correct")
    public void checkIfTheIntSumIsCorrect() {
        Assertions.assertEquals(expectedCalculationInts, calculationInts,
                "Expected result didn't match!");
    }

    @Given("calculate sum/difference of decimal numbers {double} and {double}")
    public void calculateSumOfDecimalNumbersAnd(double a, double b) {
        calculationDoubles = calculator.calculate(a, b);
    }


    @When("expected sum/difference input result is {double}")
    public void expectedSumInputResultIs(double resultDecimals) {
        expectedCalculationDoubles = resultDecimals;
    }


    @Then("we check if the int sum/difference is correct")
    public void weCheckIfTheIntSumIsCorrect() {
        Assertions.assertEquals(this.expectedCalculationDoubles, this.calculationDoubles,
                "Expected result didn't match!");
    }

    @Given("calculate difference of decimal numbers {double} and {double}")
    public void calculateDifferenceOfDecimalNumbersAnd(double a, double b) {

    }

    @When("expected difference decimal input result is {double}")
    public void expectedDifferenceDecimalInputResultIs() {

    }

    @Then("we check if the decimal difference is correct")
    public void weCheckIfTheDecimalDifferenceIsCorrect() {

    }


}
