package stepDefinitions;
import helpers.Calculator;
import helpers.DifferenceCalculatorHelper;
import helpers.SumCalculatorHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

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

    @Given("calculate sum/difference of int numbers {int} and {int} with {calculation} calculator")
    public void calculateSumOfIntNumbersAndWithSumCalculator(int a, int b, Calculator calculator) {
        calculationInts = calculator.calculate(a, b);
    }

    @Given("calculate sum/difference of decimal numbers {double} and {double} with {calculation} calculator")
    public void calculateSumOfDecimalNumbersAndWithSumCalculator(double a, double b, Calculator calculator) {
        calculationDoubles = calculator.calculate(a, b);
    }


    @When("expected int sum/difference result is {int}")
    public void expectedSumInputResultIs(int result) {
        expectedCalculationInts = result;
    }

    @When("expected double sum/difference result is {double}")
    public void expectedSumInputResultIs(double result) {
        expectedCalculationDoubles = result;
    }

    @Then("check int sum/difference is correct")
    public void checkIfTheIntSumIsCorrect() {
        Assertions.assertEquals(expectedCalculationInts, calculationInts,
                "Expected result didn't match!");
    }

    @Then("check decimal sum/difference is not correct")
    public void checkDecimalSumIsNotCorrect() {
        Assertions.assertNotEquals(expectedCalculationDoubles, calculationDoubles);
    }
}
