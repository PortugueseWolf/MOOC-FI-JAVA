
# Saveable Dictionary

In this exercise we will extend the dictionary, so that it can read words from a file and write words to a file. The dictionary must also be able to translate both from Finnish to another language and from another language to Finnish (in this exercise we ignore the fact that some words might be written the same in Finnish and in other languages). Your mission is to create a dictionary in the class SaveableDictionary. Implement the class in the package dictionary.

## Part 1 - The basic functionality

For the dictionary, implement a constructor which takes no parameters, and the following methods:

- public void add(String words, String translation) adds a word to the dictionary. Every word has just one translation, and if the same word is added for the second time, nothing happens.

- public String translate(String word) returns the translation for the given word. If the word is not in the dictionary, returns null.

In this phase, the dictionary should work as follows:

```java
SaveableDictionary dictionary = new SaveableDictionary();
dictionary.add("apina", "monkey");
dictionary.add("banaani", "banana");
dictionary.add("apina", "apfe");

System.out.println(dictionary.translate("apina"));
System.out.println(dictionary.translate("monkey"));
System.out.println(dictionary.translate("ohjelmointi"));
System.out.println(dictionary.translate("banana"));
```

Prints

```markdown
monkey
apina
null
banaani
```

As can be seen from the output, after a translation has been added to the dictionary, it can translate the word to and from Finnish.

**NB**: the methods add and translate do not read from a file or write to a file! The constructor does not use a file either.

## Part 2 - Deleting words

Add the dictionary method public void delete(String word) which deletes the given word and its translation from the dictionary.

It might be worth reviewing the material concerning deleting objects from an ArrayList from previous weeks.

NB: the method delete does not write to a file.
In this phase, the dictionary should work as follows:

```java
SaveableDictionary dictionary = new SaveableDictionary();
dictionary.add("apina", "monkey");
dictionary.add("banaani", "banana");
dictionary.add("ohjelmointi", "programming");
dictionary.delete("apina");
dictionary.delete("banana");

System.out.println(dictionary.translate("apina"));
System.out.println(dictionary.translate("monkey"));
System.out.println(dictionary.translate("banana"));
System.out.println(dictionary.translate("banaani"));
System.out.println(dictionary.translate("ohjelmointi"));
```

Prints

```markdown
null
null
null
null
programming
```

Deleting also works both ways: Both the word and its translation are removed if either the word or the translation are deleted.

## Part 3 - Reading from file

Make a constructor public SaveableDictionary(String file) and method public boolean load(), which loads the dictionary from the file given to the constructor as a parameter. If the program is unable to open the file or read from it, the method returns false, otherwise it returns true.

**NB**: the constructor only tells the dictionary the name of the file to load the dictionary from. The constructor does not read the file. Only the method load reads the file.
In the dictionary file, one line contains a word and its translation separated by ":". The exercise template contains a file words.txt which contains the following:

```markdown
apina:monkey
alla oleva:below
olut:beer
```

Read the dictionary file line by line with the method nextLine. You can split a line using the String method split like so:

```java
Scanner fileReader = new ...
while (fileReader.hasNextLine()) {
    String line = fileReader.nextLine();
    String[] parts = line.split(":");   // split the line based on the ':' character

    System.out.println(parts[0]);     // part of line before :
    System.out.println(parts[1]);     // part of line after :
}
```

The dictionary can be used as follows:

```java
SaveableDictionary dictionary = new SaveableDictionary("words.txt");
boolean wasSuccessful = dictionary.load();

if (wasSuccessful) {
    System.out.println("Successfully loaded the dictionary from file");
}

System.out.println(dictionary.translate("apina"));
System.out.println(dictionary.translate("ohjelmointi"));
System.out.println(dictionary.translate("alla oleva"));
```

Prints

```markdown
Successfully loaded the dictionary from file
monkey
null
below
```

## Part 4 - Saving to a file

Create the method public boolean save(), which saves the dictionary to the file given to the dictionary as a parameter to the constructor. If the program cannot save to the file, the method returns false. Otherwise it returns true. The dictionary files have to be saved in the form described above, so the program can read the files it has written.

**NB**: Only the method save writes to the file.
**NB**: Even though the dictionary can translate both ways, the dictionary file should only contain one way. So if the dictionary, for example, knows that computer = tietokone, the file should contain:

```markdown
tietokone:computer
```

or

```markdown
computer:tietokone
```

but not both!

It is best to handle the saving to, such that the whole dictionary is written on top of the previously saved version, so it might not be the best to use the append method described in the material.

The final version of the dictionary works as follows:

```java
SaveableDictionary dictionary = new SaveableDictionary("words.txt");
dictionary.load();

// use the dictionary

dictionary.save();
```

In the beginning, the dictionary is loaded from a file, and, in the end, it is saved back to the file, so that changes made to the dictionary are kept for the next time the dictionary is used.
