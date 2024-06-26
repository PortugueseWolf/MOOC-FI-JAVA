
# Literature

Write a program that reads user input for books and their age recommendations.

The program asks for new books until the user gives an empty String (only presses enter). After this, the program will print the number of books, their names, and their recommended ages.

## Part 1 - Reading and Printing Books

Implement the reading and printing the books first, the ordering of them doesn't matter yet.

```markdown
Input the name of the book, empty stops: The Ringing Lullaby Book
Input the age recommendation: 0

Input the name of the book, empty stops: The Exiting Transpotation Vehicles
Input the age recommendation: 0

Input the name of the book, empty stops: The Snowy Forest Calls
Input the age recommendation: 12

Input the name of the book, empty stops: Litmanen 10
Input the age recommendation: 10

Input the name of the book, empty stops:

4 books in total.

Books:
The Ringing Lullaby Book (recommended for 0 year-olds or older)
The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)
The Snowy Forest Calls (recommended for 12 year-olds or older)
Litmanen 10 (recommended for 10 year-olds or older)
```

## Part 2 - Ordering books based on their age recommendation

Expand your program so, that the books are sorted based on their age recommendations when they are printed. If two (or more) books share the same age recommendations the order between them does not matter.

```markdown
Input the name of the book, empty stops: The Ringing Lullaby Book
Input the age recommendation: 0

Input the name of the book, empty stops: The Exiting Transpotation Vehicles
Input the age recommendation: 0

Input the name of the book, empty stops: The Snowy Forest Calls
Input the age recommendation: 12

Input the name of the book, empty stops: Litmanen 10
Input the age recommendation: 10

Input the name of the book, empty stops:

4 books in total.

Books:
The Ringing Lullaby Book (recommended for 0 year-olds or older)
The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)
Litmanen 10 (recommended for 10 year-olds or older)
The Snowy Forest Calls (recommended for 12 year-olds or older)
```

## Part 3 - Ordering books based on their age recommendation and name

Expand your program, so that it sorts the books with the same age recommendation based on their name alphabetically.

```markdown
Input the name of the book, empty stops: The Ringing Lullaby Book
Input the age recommendation: 0

Input the name of the book, empty stops: The Exiting Transpotation Vehicles
Input the age recommendation: 0

Input the name of the book, empty stops: The Snowy Forest Calls
Input the age recommendation: 12

Input the name of the book, empty stops: Litmanen 10
Input the age recommendation: 10

Input the name of the book, empty stops:

4 books in total.

Books:
The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)
The Ringing Lullaby Book (recommended for 0 year-olds or older)
Litmanen 10 (recommended for 10 year-olds or older)
The Snowy Forest Calls (recommended for 12 year-olds or older)
```
