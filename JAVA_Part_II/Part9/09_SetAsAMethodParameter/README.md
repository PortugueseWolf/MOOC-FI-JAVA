
# Set as a method parameter

In the Main-class, implement the static method returnSize, which receives a Set object as a parameter and returns its size.

The method should work e.g. like this:

```java
Set<String> names = new HashSet<>();
names.add("first");
names.add("first");
names.add("second");
names.add("second");
names.add("second");

System.out.println(returnSize(names));
```

Prints:

```markdown
2
```
