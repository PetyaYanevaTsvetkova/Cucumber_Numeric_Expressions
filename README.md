## Project's Title:
	Cucumber: Numeric Expressions

## Project Description:
		
	Theory:
	Numeric expressions - {int}, {float}, {bigdecimal}, {double}, {biginteger}, {byte}, {short}, {long}
	Custom Parameter types with Strategy design pattern
	Optional text
	Creating step definitions with standard Java methods (next chapter we will cover Java Lambdas)

	Practical tasks:
	Verify the calculation of numbers 
	Description: Implement Cucumber tests that verify the output from the attached calculator helper classes.
	Scenarios should be separated by a Rule for Integers and Decimals or a Rule for the calculator type
	(sum or difference).  Using a custom parameter set the appropriate calculator - for sum or difference.
	There is no need to test all available methods.

	Examples:

      | Input       | Calculator | Result calculated | Set expected output to | Test Status |
      | 3 and 5     | sum        | 8                 | 8                      | Passed      |
      | 1.2 and 3.0 | sum        | 4.2               | 5.2                    | Failed      |
      | 10 and 6    | difference | 4                 | 4                      | Passed      |
      | 7.5 and 2.5 | difference | 5.0               | 3.8                    | Failed      |


	Compare two columns with numbers
	Description: Implement a Cucumber scenario with a step that accepts a Data table of  two columns with numbers. Using the attached calculator helpers perform the target calculations by column. Using a custom parameter set the appropriate calculator - for sum or difference
	Example 1: sum all the numbers in the first column and sum all the numbers in the second column. 
	Example 2: calculate the difference of all the numbers in the first column and calculate the difference of all the numbers in the second column. 
	Verify which  column has the bigger calculation.

	Acceptance criteria:
	Test scenarios are running and are implemented as per definitions above. 
	Trainee understands and has used Numeric expressions in the implemented tests.
	Trainee understands and has used Custom parameter types and Optional text in the implemented tests.
	Trainee is able to map Cucumber scenarios to step definitions with numeric expressions.
	Specific group or sub-group (suite) of tests can be executed through the JUnit Cucumber Test Runner class.

## Table of Contents:
	numericexpresion
	README.md file
	.gitignore file
	

## How to Install and Run the Project:
	IDE need to execute the java project
	 
## How to Use the Project:
	Maven need

## Useful links:
	https://github.com/cucumber/cucumber-expressions

## Add a License
	no needed


