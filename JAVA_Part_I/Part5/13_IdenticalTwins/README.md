
# Identical twins

In the exercise base you can find the Person class that is linked with an SimpleDate object. Add to the class Person the method public boolean equals (Object compared), which can be used to compare the similarity of people. The comparison should take into account the equality of all the variables of a person (birthday included).

NB! Recall that you cannot compare two birthday objects with equality signs!

There are no tests in the exercise template to check the correctess of the solution. Only return your answer after the comparison works as it should. Below is some code to help test the program.

```java
SimpleDate date = new SimpleDate(24, 3, 2017);
SimpleDate date2 = new SimpleDate(23, 7, 2017);

Person leo = new Person("Leo", date, 62, 9);
Person lily = new Person("Lily", date2, 65, 8);

if (leo.equals(lily)) {
    System.out.println("Is this quite correct?");
}

Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

if (leo.equals(leoWithDifferentWeight)) {
    System.out.println("Is this quite correct?");
}
```
