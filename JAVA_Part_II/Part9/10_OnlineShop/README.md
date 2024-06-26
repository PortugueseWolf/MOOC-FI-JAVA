
# Online Shop

In this exercise we'll create program components, that can be used to run an online store.

## Part 1 - Warehouse

Create the class Warehouse with the following methods:

- public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and stock balance given as parameters.
- public int price(String product), which returns the price of the product it received as a parameter. If the product hasn't been added to the warehouse, the method must return -99.
The products in the warehouse (and in the next part their stock) must be stored in a variable of the type Map<String, Integer>! The object created can be a HashMap, but its type must be the Map-interface, rather than any implementation of that interface.

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("milk", 3, 10);
warehouse.addProduct("coffee", 5, 7);

System.out.println("prices:");
System.out.println("milk: " + warehouse.price("milk"));
System.out.println("coffee: " + warehouse.price("coffee"));
System.out.println("sugar: " + warehouse.price("sugar"));
```

Prints:

```markdown
prices:
milk: 3
coffee: 5
sugar: -99
```

## Part 2 - Products stock balance

Save the stock balance of products in a variable with the Map<String, Integer> type, in the same way the prices were stored. Supplement the warehouse with the following methods:

- public int stock(String product) returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
- public boolean take(String product) reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. If the product was not available in the warehouse the method returns false. A products stock can't go below zero.
An example of the warehouse in use:

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("coffee", 5, 1);

System.out.println("stock:");
System.out.println("coffee:  " + warehouse.stock("coffee"));
System.out.println("sugar: " + warehouse.stock("sugar"));

System.out.println("taking coffee " + warehouse.take("coffee"));
System.out.println("taking coffee " + warehouse.take("coffee"));
System.out.println("taking sugar " + warehouse.take("sugar"));

System.out.println("stock:");
System.out.println("coffee:  " + warehouse.stock("coffee"));
System.out.println("sugar: " + warehouse.stock("sugar"));
```

Prints:

```markdown
stock:
coffee:  1
sugar: 0
taking coffee true
taking coffee false
taking sugar false
stock:
coffee:  0
sugar: 0
```

## Part 3 - Listing the products

Let's add one more method to the warehouse:

- public Set<String> products() returns the names of the products in the warehouse as a Set
This method is easy to implement with HashMap. You can get the products in the warehouse from either the Map storing the prices or the one storing current stock, by using the method keySet()

An example use case:

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("milk", 3, 10);
warehouse.addProduct("coffee", 5, 6);
warehouse.addProduct("buttermilk", 2, 20);
warehouse.addProduct("yogurt", 2, 20);

System.out.println("products:");

for (String product: warehouse.products()) {
    System.out.println(product);
}
```

```markdown
products:
buttermilk
yogurt
coffee
milk
```

## Part 4 - Item

Items can be added to the shopping cart (which we'll add soon). An item is a product with a quantity. You for example add an item representing one bread to the cart, or add an item representing 24 coffees.

Create the class Item with the following methods:

- public Item(String product, int qty, int unitPrice); a constructor that creates an item corresponding to the product given as a parameter. qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
- public int price() return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
- public void increaseQuantity increases the quantity by one.
- public String toString() returns the string representation of the item. which must match the format shown in the example below.
An example of the Item class being used:

```java
Item item = new Item("milk", 4, 2);
System.out.println("an item that contains 4 milks has the total price of " + item.price());
System.out.println(item);
item.increaseQuantity();
System.out.println(item);
```

```markdown
an item that contains 4 milks has the total price of 8
milk: 4
milk: 5
```

NB: The toString is formatted like this: product: qty — price is not included in the string representation.

## Part 5 - Shopping cart

We finally get to implement the shopping cart class!

Internally, ShoppingCart stores products added there as Item-objects. ShoppingCart must have an instance variable with either the Map<String, Item> type, or the List<Item> type. Don't add any other instance variable to the ShoppingCart class, besides the List or Map used to store the items.

NB: If you save the items in a Map type variable, you'll finds its values() method to be quite useful for going though all the items objects stored in it for both this part of the exercise and the next.

First let's give ShoppingCart a constructor with no parameters and these methods:

- public void add(String product, int price) adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
- public int price() returns the total price of the shopping cart.

```java
ShoppingCart cart = new ShoppingCart();
cart.add("milk", 3);
cart.add("buttermilk", 2);
cart.add("cheese", 5);
System.out.println("cart price: " + cart.price());
cart.add("computer", 899);
System.out.println("cart price: " + cart.price());
```

```markdown
cart price: 10
cart price: 909
```

## Part 6 - Printing the cart

Implement the method public void print() for the shopping cart. The method prints the Item-objects in the cart. The order they are printed in is irrelevant. E.g the print of the cart in the previous example would be:

```markdown
buttermilk: 1
cheese: 1
computer: 1
milk: 1
```

NB: the number printed is the quantity in the cart, not the price!

## Part 7 - One item per product

Let's change our cart so that if a product is being added thats already in the cart, we don't add a new item, but instead update item already in the cart by calling its increaseQuantity() method.

E.g:

```java
ShoppingCart cart = new ShoppingCart();
cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("buttermilk", 2);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");
```

```markdown
milk: 1
cart price: 3

buttermilk: 1
milk: 1
cart price: 5

buttermilk: 1
milk: 2
cart price: 8

buttermilk: 1
milk: 3
cart price: 11
```

So in the example above, we first added milk and buttermilk and they get their own Item-objects. When more milk is added to to cart, instead of adding new items we increase the quantity in the item representing milk.

## Part 8 - Store

We now have all the parts we need for our "online store", except the store itself. Let's make that next. Our store has a warehouse that includes all our products. For each 'visit' we have a shopping cart. Every time the customer chooses a product its added to their cart if its available in the warehouse. At the same time, the stock in the warehouse is reduced by one.

Below you'll find a template for a text-based user interface for our store. Create a Store class for your project and copy-paste the code below there.

```java

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // Add code here that adds the product to the cart,
            // If there is any in the warehouse, and reduces the stock in the warehouse
            // Don't touch any of the other code!
        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
```

The following is a main method that stocks the stores warehouse and sends John to shop in the store.

```java
Warehouse warehouse = new Warehouse();
    warehouse.addProduct("coffee", 5, 10);
    warehouse.addProduct("milk", 3, 20);
    warehouse.addProduct("cream", 2, 55);
    warehouse.addProduct("bread", 7, 8);

    Scanner scanner = new Scanner(System.in);

    Store store = new Store(warehouse, scanner);
    store.shop("John");
```

The store is almost done. The method public void shop(String customer) has a part you need to complete, marked with comments. In the marked part, add code that checks if the product requested by the customer is available and has stock in the warehouse. If so, reduce the products stock in the warehouse and add the product to the shopping cart.

In reality an online store would be implemented a little differently. Web-apps have an HTML-page as a user interface, and clicks there are sent to a server application. There are several courses related to web development available at the University Of Helsinki.
