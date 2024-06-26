
# Validating parameters

Let's practise a little parameter validation with the IllegalArgumentException exception. There are two classes included with the exercise base: Person and Calculator. Modify the classes in the following manner:

## Part 1 - Validating a person

The constructor of the class Person should ensure that the name given as the parameter is not null, empty, or over 40 characters in length. The age should between 0 and 120. If some of these conditions are not met, the constructor should throw an IllegalArgumentException.

## Part 2 - Validating the calculator

The methods of the Calculator class should be as follows: The method factorial should only work if the parameter is a non-negative number (0 or greater). The method binomialCoefficient should only work when the parameters are non-negative and the subset size does not exceed the set size. If these methods receive invalid parameters when they are called, they should throw an IllegalArgumentException
