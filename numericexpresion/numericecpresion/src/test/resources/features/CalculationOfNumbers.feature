# Created by 5q
@NumericExpressions
Feature: Test Calculator functionality for Sum and Difference

  Rule: Sum of the two numbers
    @SumIntegers_Pass
    Scenario: Adding Integers
      Given calculate sum of int numbers 3 and 5 with sum calculator
      When expected int sum result is 8
      Then check int sum is correct

    @SumOfDecimals_Fail
    Scenario: Adding Decimals
      Given calculate sum of decimal numbers 1.2 and 3.0 with sum calculator
      When expected double sum result is 5.2
      Then check decimal sum is not correct

  Rule: Difference of the two numbers
    @DifferenceOfIntegers_Pass
    Scenario: Difference of Integers
      Given calculate difference of int numbers 10 and 6 with difference calculator
      Then expected int difference result is 4
      When check int difference is correct

    @DifferenceOfDecimals_Fail
    Scenario: Difference of Decimals
      Given calculate difference of decimal numbers 7.5 and 2.5 with difference calculator
      When expected double difference result is 3.8
      Then check decimal difference is not correct


