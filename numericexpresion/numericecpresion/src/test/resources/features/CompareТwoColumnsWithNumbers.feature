# Created by 5q
Feature: Testing Data Table calculation

  Rule: Calculations are done by columns and then compared

    @TestingSum
    Scenario: Sum of numbers by column from a Data Table
      Given we have the following numbers:
        | 3  | 2  |
        | -1 | -5 |
      When we use operator sum
      Then we print the result and compare

    @TestingDifference
    Scenario: Difference of numbers by columns from a Data Table
      Given we have the following numbers:
        | 3  | 2  |
        | -1 | -5 |
      When we use operator difference
      Then we print the result and compare