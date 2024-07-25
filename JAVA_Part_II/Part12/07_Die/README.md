
# Die

The exercise template contains a class Die, which has the following body:

```java
import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
    }
}
```

Modify the class, such that the constructor Die(int numberOfFaces) creates a new die-object with the given number of faces (i.e. the number of "sides" with a number). Also, modify the method throwDie so it returns the result of a random throw of the die, which should be a value withing the range 1 ... number of faces.

The following is a main program for testing the die:

```java
public class Program {
    public static void main(String[] args) {
        Die die = new Die(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
    }
}
```

The output could be as follows:

```markdown
1
6
3
5
3
3
2
2
6
1
```
