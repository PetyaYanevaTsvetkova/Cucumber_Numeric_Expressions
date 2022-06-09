package stepDefinishions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class CompareТwoColumnsWithNumbers {
    private final List<Integer> firstColumnNumbers = new ArrayList<>();
    private final List<Integer> secondColumnNumbers = new ArrayList<>();
    int calculationOfFirstColumnNumbers = 0;
    int calculationOfSecondColumnNumbers = 0;
    String calculationType;

    @ParameterType("sum|difference")
    public String operation(String operation) {
        return operation;
    }

    @Given("we have the following numbers:")
    public void weHaveTheFollowingNumbers(List<List<Integer>> rows) {
        rows
                .forEach(column -> {
                    firstColumnNumbers.add(column.get(0));
                    secondColumnNumbers.add(column.get(1));
                });
    }

    @When("we use operator {operation}")
    public void weUseOperatorSumDifference(String operation) {
        calculationType = operation;
        System.out.println("Setting calculation type to: " + calculationType);

        if (operation.equals("sum")) {
            for (int n : firstColumnNumbers) {
                calculationOfFirstColumnNumbers += n;
            }
            for (int n : secondColumnNumbers) {
                calculationOfSecondColumnNumbers += n;
            }

        } else if (operation.equals("difference")) {
            for (int n : firstColumnNumbers) {
                calculationOfFirstColumnNumbers -= n;
            }
            for (int n : secondColumnNumbers) {
                calculationOfSecondColumnNumbers -= n;
            }
        }
    }

    @Then("we print the result and compare")
    public void wePrintTheResults() {
        if (calculationOfFirstColumnNumbers == calculationOfSecondColumnNumbers) {
            System.out.println("Calculations are equal!");
        } else if (calculationOfFirstColumnNumbers > calculationOfSecondColumnNumbers) {
            System.out.println("Calculation of column one is grater");
        } else {
            System.out.println("Calculation of column two is greater");
        }
    }
}
