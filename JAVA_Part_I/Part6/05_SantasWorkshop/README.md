
# Santa's Workshop

We'll practise wrapping gifts in this exercise. Let's create the classes Gift and Package. The gift has a name and weight, and the package contains gifts.

## Part 1 - Gift-class

Create a Gift class, where the objects instantiated from it represent different kinds of gifts. The information that's recorded is the name and weight of the item (kg).

Add the following methods to the class:

- Constructor for which the name and weight of the gift are given as parameters

- Method public String getName(), which returns the name of the gift

- Method public int getWeight(), which returns the weight of the gift

- Method public String toString(), which returns a string in the form "name (weight kg)"

The following is an example of the class in use:

```java
public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }
}
```

The program's print output should be as follows:

```markdown
Gift's name: Harry Potter and the Philosopher's Stone
Gift's weight: 2
Gift: Harry Potter and the Philosopher's Stone (2 kg)
```

## Part 2 - Package-class

Create a Package class to which gifts can be added, and that keeps track of the total weight of the gifts in the package. The class should contain:

- A parameterless constructor

- Method public void addGift(Gift gift), which adds the gift passed as a parameter to the package. The method returns no value.

- Method public int totalWeight(), which returns the total weight of the package's gifts.

It's recommended to store the items in an ArrayList object.

```java
public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
```

The program's output should be the following:

```markdown
2
```
