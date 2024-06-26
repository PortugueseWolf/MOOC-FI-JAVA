
# Interface in a box

## Part 1 - Packables

Moving houses requires packing all your belongings into boxes. Let's imitate that with a program. The program will have boxes, and items to pack into those boxes. All items must implement the following Interface:

```java
public interface Packable {
    double weight();
}
```

Add the Interface to your program. Adding a new Interface is quite similar to adding a new class. Instead of selecting new Java class just select new Java interface.
Create classes Book and CD, which implement the Interface. Book has a constructor which is given the author (String), name of the book (String), and the weight of the book (double) as parameters. CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int). The weight of all CDs is 0.1 kg.

Remember to implement the Interface Packable in both of the classes. The classes must work as follows:

```java
public static void main(String[] args) {
    Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
    Book book2 = new Book("Robert Martin", "Clean Code", 1);
    Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

    CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
    CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
    CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(cd1);
    System.out.println(cd2);
    System.out.println(cd3);
}
```

Prints:

```markdown
Fyodor Dostoevsky: Crime and Punishment
Robert Martin: Clean Code
Kent Beck: Test Driven Development
Pink Floyd: Dark Side of the Moon (1973)
Wigwam: Nuclear Nightclub (1975)
Rendezvous Park: Closer to Being Here (2012)
```

NB: The weight is not printed

## Part 2 - Box

Make a class called Box. Items implementing the Packable interface can be packed into a box. The Box constructor takes the maximum capacity of the box in kilograms as a parameter. The combined weight of all items in a box cannot be more than the maximum capacity of the box.

Below is an example of using a box:

```java
public static void main(String[] args) {
    Box box = new Box(10);

    box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
    box.add(new Book("Robert Martin", "Clean Code", 1));
    box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(box);
}
```

Prints

```markdown
Box: 6 items, total weight 4.0 kg
```

NB: As the weights are saved as a double, the calculations might have some small rounding errors. You don't need to worry about them.

## Part 3 - Box weight

If you made an class variable double weight in the Box class, replace it with a method which calculates the weight of the box:

```java
public class Box {
    //...

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        return weight;
    }
}
```

When you need the weight of the box, for example when adding a new item to the box, you can just call the weight method.

The method could also return the value of an object variable. However here we are practicing a situation, where we do not have to maintain an object variable explicitly, but can calculate its value as needed. After the next exercise storing the weight as an object variable would not necessary work anyway. After completing the exercise have a moment to think why that is.

## Part 4 - A Box is packable too

Implementing the Packable Interface requires a class to have the method double weight(). We just added this method to the Box class. This means we can make the Box packable as well!

Boxes are objects, which can contain objects implementing the packable Interface. Boxes implement this Interface as well. So a box can contain other boxes!

Try this out. Make some boxes containing some items, and add some smaller boxes to a bigger box. Try what happens, when you put a box in itself. Why does this happen?
