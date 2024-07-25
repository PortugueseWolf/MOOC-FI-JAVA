
# Array as a string

Create in the exercise base a method called public static String arrayAsString(int[][] array). It should create a string representation of the array it receives as the parameter and return it.

Brush up on using StringBuilder in part 10.3 before taking on this exercise. Below there are a few examples of how the method is expected to work.

```java
int rows = 2;
int columns = 3;
int[][] matrix = new int[rows][columns];
matrix[0][1] = 5;
matrix[1][0] = 3;
matrix[1][2] = 7;
System.out.println(arrayAsString(matrix));
```

```markdown
050
307
```

```java
int[][] matrix = {
    {3, 2, 7, 6},
    {2, 4, 1, 0},
    {3, 2, 1, 0}
};

System.out.println(arrayAsString(matrix));
```

```markdown
3276
2410
3210
```
