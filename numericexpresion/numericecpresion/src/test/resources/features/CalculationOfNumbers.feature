# Created by 5q
@NumericExpressions
Feature: Test Calculator functionality for Sum and Difference

  Background:
  Given there is a sum calculator

  Rule: Sum of the two numbers
    @SumIntegers_Pass
    Scenario: Adding Integers
      Given calculate sum of int numbers 3 and 5
      When expected sum input result is 8
      Then check if the int sum is correct

    @SumOfDecimals_Fail
    Scenario: Adding Decimals
      Given calculate sum of decimal numbers 1.2 and 3.0
      When expected sum input result is 5.2
      Then we check if the int sum is correct


  Rule: Subtract of the two numbers
    @DifferenceOfIntegers_Pass
    Scenario: Difference of Integers
      Given calculate difference of int numbers 10 and 6
      Then expected difference input result is 4
      When we check if the int difference is correct

    @DifferenceOfDecimals_Fail
    Scenario: Difference of Decimals
      Given calculate difference of decimal numbers 7.5 and 2.5
      When expected difference decimal input result is 3.8
      Then we check if the decimal difference is correct


