
# Print me my Hashmap

Exercise template contains a class Program. Implement the following class methods in the class:

- public static void printKeys(HashMap<String,String> hashmap), prints all the keys in the hashmap given as a parameter.
- public static void printKeysWhere(HashMap<String,String> hashmap, String text) prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
- public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text), prints the values in the given hashmap whichs keys contain the given string.
Example of using the class methods:

```java
HashMap<String, String> hashmap = new HashMap<>();
hashmap.put("f.e", "for example");
hashmap.put("etc.", "and so on");
hashmap.put("i.e", "more precisely");

printKeys(hashmap);
System.out.println("---");
printKeysWhere(hashmap, "i");
System.out.println("---");
printValuesOfKeysWhere(hashmap, ".e");
```

```markdown
f.e
etc.
i.e
---
i.e
---
for example
more precisely
```

NB! The order of the output can vary, because the implementation of hashmaps does not guarantee the order of the objects in it.
