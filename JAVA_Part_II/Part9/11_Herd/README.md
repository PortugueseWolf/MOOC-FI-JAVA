
# Herd

In this exercise we are going to create organisms and herds of organisms that can move around. To represent the locations of the organisms we'll use a two-dimensional coordinate system. Each position involves two numbers: x and y coordinates. The x coordinate indicates how far from the origin (i.e. point zero, where x = 0, y = 0) that position is horizontally. The y coordinate indicates the distance from the origin vertically. If you are not familiar with using a coordinate system, you can study the basics from Wikipedia.


The exercise base includes the interface Movable, which represents something that can be moved from one position to another. The interface includes the method void move(int dx, int dy). The parameter dx tells how much the object moves on the x axis, and dy tells the distance on the y axis.

This exercise involves implementing the classes Organism and Herd, both of which are movable.

## Part 1 - Implementing the Organism Class

Create a class called Organism that implements the interface Movable. An organism should know its own location (as x, y coordinates). The API for the class Organism is to be as follows:

- public Organism(int x, int y)
The class constructor that receives the x and y coordinates of the initial position as its parameters.
- public String toString()
Creates and returns a string representation of the organism. That representation should remind the following: "x: 3; y: 6". Notice that a semicolon is used to separate the coordinates.
- public void move(int dx, int dy)
Moves the object by the values it receives as parameters. The dx variable contains the change to coordinate x, and the dy variable ontains the change to the coordinate y. For example, if the value of dx is 5, the value of the object variable x should be incremented by five.
Use the following code snippet to test the Organism class.

```java
Organism organism = new Organism(20, 30);
System.out.println(organism);
organism.move(-10, 5);
System.out.println(organism);
organism.move(50, 20);
System.out.println(organism);
```

```markdown
x: 20; y: 30
x: 10; y: 35
x: 60; y: 55
```

## Part 2 - Implementing the Herd

Create a class called Herd that implements the interface Movable. A herd consists of multiple objects that implement the Movable interface. They must be stored in e.g. a list data structure.

The Herd class must have the following API.

- public String toString()
Returns a string representation of the positions of the members of the herd, each on its own line.
- public void addToHerd(Movable movable)
Adds an object that implements the Movable interface to the herd.
- public void move(int dx, int dy)
Moves the herd with by the amount specified by the parameters. Notice that here you have to move each member of the herd.
Test out your program with the sample code below:

```java
Herd herd = new Herd();
herd.addToHerd(new Organism(57, 66));
herd.addToHerd(new Organism(73, 56));
herd.addToHerd(new Organism(46, 52));
herd.addToHerd(new Organism(19, 107));
System.out.println(herd);
```

```markdown
x: 57; y: 66
x: 73; y: 56
x: 46; y: 52
x: 19; y: 107
```
