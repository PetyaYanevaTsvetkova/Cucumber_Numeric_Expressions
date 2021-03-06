# Created by Petya Yaneva-Tsvetkova
Feature: Testing Data Table calculation

  Rule: Calculations are done by columns and then compared

    @TestingSum
    Scenario: Sum of numbers by column from a Data Table
      Given we have the following numbers:
        | 8  | 4  |
        | -1 | -20 |
      When we use operator sum
      Then we print the result and compare

    @TestingDifference
    Scenario: Difference of numbers by columns from a Data Table
      Given we have the following numbers:
        | 120  | 65  |
        | -65 | -8 |
      When we use operator difference
      Then we print the result and compare