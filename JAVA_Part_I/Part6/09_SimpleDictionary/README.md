The exercise base contains a class SimpleDictionary that allows for storing words and their translations. The internal implementation of the class contains some techniques not (yet) covered on the course. Nevertheless, it's fairly simple to use it:

```java
SimpleDictionary book = new SimpleDictionary();
book.add("one", "yksi");
book.add("two", "kaksi");

System.out.println(book.translate("one"));
System.out.println(book.translate("two"));
System.out.println(book.translate("three"));
```

```markdown
yksi
kaksi
null
```

In this exercise you will implement a text user interface that takes use of the SimpleDictionary class. And maybe pick up a few Finnish words while doing it!

## Part 1 - Starting and Stopping UI

Implement the class TextUI that receives as constructor parameters a Scanner and SimpleDictionary objects. Then give the class a method called public void start(). The method should work as follows:

1. The method asks the user for a command
2. If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
3. Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.

```java
Scanner scanner = new Scanner(System.in);
SimpleDictionary dictionary = new SimpleDictionary();

TextUI ui = new TextUI(scanner, dictionary);
ui.start();
```

```markdown
Command: something
Unknown command
Command: add
Unknown command
Command: end
Bye bye!
```

## Part 2 - Adding a Translation

Modify the method public void start() so that it works in the following way:

1. The method asks the user for a command.
2. If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
3. If the command is add, the text UI asks the user for a word and a translation, each on its own line. After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).
4. Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.

```markdown
Command: something
Unknown command
Command: add
Word: pike
Translation: hauki
Command: change
Unknown command
Command: end
Bye bye!
```

In the example above, we added the word "pike" and its translation "hauki" to the SimpleDictionary object. After exiting the text user interface the dictionary could be used in the following manner:

```java
Scanner scanner = new Scanner(System.in);
SimpleDictionary dictionary = new SimpleDictionary();

TextUI textUI = new TextUI(scanner, dictionary);
textUI.start();
System.out.println(dictionary.translate("pike")); // prints the string "hauki"
```

## Part 3 - Translating a Word

Modify the method public void start() so that it works in the following:

1. The method asks the user for a command.
2. If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
3. If the command is add, the text UI asks the user for a word and a translation, each on its own line. After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).
4. If the command is search, the text UI asks the user for the word to be translated. After this it prints the translation of the word, and the method continues by asking for a new command (loops back to stage 1).
5. Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.

```markdown
Command: something
Unknown command
Command: add
Word: pike
Translation: hauki
Command: change
Unknown command
Command: search
To be translated: pike
Translation: hauki
Command: search
To be translated: carrot
Translation: null
Command: end
Bye bye!
```

## Part 4 - Cleaning up the Translation

Modify the searching functionality of the UI so that if the word isn't found (i.e. the dictionary returns null), the UI prints the message "Word (searched word) was not found".

```markdown
Command: something
Unknown command
Command: add
Word: pike
Translation: hauki
Command: change
Unknown command
Command: search
To be translated: pike
Translation: hauki
Command: search
To be translated: carrot
Word carrot was not found
Command: end
Bye bye!
```
