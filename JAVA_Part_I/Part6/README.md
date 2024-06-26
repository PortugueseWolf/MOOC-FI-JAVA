
# Joke Manager

The exercise base contains the following program that has been written "in the main".

```java
Scanner scanner = new Scanner(System.in);
ArrayList<String> jokes = new ArrayList<>();
System.out.println("What a joke!");

while (true) {
    System.out.println("Commands:");
    System.out.println(" 1 - add a joke");
    System.out.println(" 2 - draw a joke");
    System.out.println(" 3 - list jokes");
    System.out.println(" X - stop");

    String command = scanner.nextLine();

    if (command.equals("X")) {
        break;
    }

    if (command.equals("1")) {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokes.add(joke);
    } else if (command.equals("2")) {
        System.out.println("Drawing a joke.");

        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            System.out.println(jokes.get(index));
        }

    } else if (command.equals("3")) {
        System.out.println("Printing the jokes.");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
```

The application is in practice a storage for jokes. You can add jokes, get a randomized joke, and the stored jokes can be printed. In this exercise the program is divided into parts in a guided manner.

## Part 1 - Joke Manager

Create a class called JokeManager and move the functionality to manage jokes in it. The class must have a parameter-free constructor, and the following methods:

- public void addJoke(String joke) - adds a joke to the manager.
- public String drawJoke() - chooses one joke at random and returns it. It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".
- public void printJokes() - prints all the jokes stored in the joke manager.
An example of how to use the class:

```java
JokeManager manager = new JokeManager();
manager.addJoke("What is red and smells of blue paint? - Red paint.");
manager.addJoke("What is blue and smells of red paint? - Blue paint.");

System.out.println("Drawing jokes:");
for (int i = 0; i < 5; i++) {
    System.out.println(manager.drawJokes());
}

System.out.println("");
System.out.println("Printing jokes:");
manager.printJokes();
```

Below is a possible output of the program. Notice that the jokes will probably not be drawn as in this example.

```markdown
Drawing jokes:
What is blue and smells of red paint? - Blue paint.
What is red and smells of blue paint? - Red paint.
What is blue and smells of red paint? - Blue paint.
What is blue and smells of red paint? - Blue paint.
What is blue and smells of red paint? - Blue paint.

Printing jokes:
What is red and smells of blue paint? - Red paint.
What is blue and smells of red paint? - Blue paint.
```

## Part 2 - User Interface

Create a class called UserInterface and move the UI functionality of the program there. The class must have a constructor with two parameters. The first parameter is an instance of the JokeManager class, and the second parameter is an instance of the Scanner class. In addition, the class should have the method public void start() that can be used to start the user interface.

The user interface should provide the user with the following commands:

- X - ending: exits the method start.
- 1 - adding: asks the user for the joke to be added to the joke manager, and then adds it.
- 2 - drawing: chooses a random joke from the joke manager and prints it. If there are no jokes in the manager, thi string "Jokes are in short supply." will be printed.
- 3 - printing: prints all the jokes stored in the joke manager.

An example of how to use the UI:

```java
JokeManager manager = new JokeManager();
Scanner scanner = new Scanner(System.in);

UserInterface ui = new UserInterface(manager, scanner);
ui.start();
```

```markdown
Commands:
1 - add a joke
2 - draw a joke
3 - list jokes
X - stop
1
Write the joke to be added:
Did you hear about the claustrophobic astronaut? — He just needed a little space.
Commands:
1 - add a joke
2 - draw a joke
3 - list jokes
X - stop
3
Printing the jokes.
Did you hear about the claustrophobic astronaut? — He just needed a little space.
Commands:
1 - add a joke
2 - draw a joke
3 - list jokes
X - stop
X
```
