
# Magic square

In the exercise base there is a partially implemented class called MagicSquare that we can use as a basis for our program. Your assignment is to first add functionality to the class so that it can check whether a given square is magical. After this you'll implement an algorithm for creating a magic square.

## Part 1 - Sums of rows

In the class MagicSquare there is already a method called public ArrayList<Integer> sumsOfRows(), which returns an empty ArrayList object. Change the functionality of the method so that it returns a list of sums of every row of the (magic) square.

For example, with the following magic square the sumOfRows method should return a list that contains the integers 15, 15, 15.

```markdown
8 1 6
3 5 7
4 9 2
```

Even if the magic square is not a "legitimate" magic square, the sums of the rows should still be returned. With the input below, the sumsOfRows should return a list with the integer contents 6, 15, 24.

```markdown
1 2 3
4 5 6
7 8 9
```

## Part 2 - Sums of columns

There already exists a stub for the method public ArrayList<Integer> sumsOfColumns. At the moment it only returns an empty ArrayList object. Change the functionality of the method so that it returns a list that contains the sums of every column of the magic square.

As an example, when receiving the following magic square the sumsOfColumns should return a list that contains the integers 15, 15, 15.

```markdown
8 1 6
3 5 7
4 9 2
```

Even if the magic square is not a "legitimate" magic square, the sum of columns should be returned. In the example below, the sumsOfColumns method should return a list that contains the integers 12, 15, 18.

```markdown
1 2 3
4 5 6
7 8 9
```

## Part 3 - Sums of diagonals

Next, implement the method public ArrayList<Integer> sumsOfDiagonals() that returns a list with the sums of the diagonals of a magic square.

With the following magic square, for instance, the method should return a list with the contents 15, 15 (8 + 5 + 2) and (4 + 5 + 6).

```markdown
8 1 6
3 5 7
4 9 2
```

Even if the square is not a "legitimate" magic square, the sums of the diagonals should still be returned. With the square below, the sumsOfDiagonals should return a list with the integer contents (15, 15) (1 + 5 + 9) and (7 + 5 + 3).

```markdown
1 2 3
4 5 6
7 8 9
```

## Part 4 - Conjuring a magic square

NB! This part might be quite tricky, so you might want to return the previous sections before beginning it.

It's also possible to create magic squares of your own. Let's familiarize ourselves with the Siamese method. It can be used to create magic squares that have an odd size (as opposed to even).

The Siamese method algorithm works in the following manner. You set number one to the centermost column of the top row. After this, we move one row up and one column right, and place number two in this cell. We continue by moving one right, one up, and placing the number 3, etc.

Two rules govern the number placements:

1 - If the transition would leave us outside the bounds of the magic square, we jump to the opposite edge. In other words, if we go "over the right edge" we continue from the left edge, and if we go "over the top edge" we continue from the bottom.

2 - If the place already contains a number, we don't go up and right. Instead we take one step downwards.
Check the visualization for the described algorithm on the Wikipedia page Siamese method.

Implement in the class MagicSquareFactory the method createMagicSquare. It should return a magic square whose side has the length that is specified as the parameter. The method only needs to work in cases where the width of the square is an odd integer.