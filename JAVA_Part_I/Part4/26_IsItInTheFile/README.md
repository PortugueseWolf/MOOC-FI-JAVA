
# Is it in the file?

The exercise template comes with two files, names.txt and other-names.txt. Write a program that first asks the user for the name of the file to be read, after which the user is prompted for the string that they're looking for. The program then reads the file and searches for the desired string.

If the string is found, the program should print "Found!". If not, the program should print "Not found.". If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".

```markdown
Name of the file:
names.txt
Search for:
Antti
Not found.
```

```markdown
Name of the file:
names.txt
Search for:
ada
Found!
```

```markdown
Name of the file:
nonexistent.txt
Search for:
test
Reading the file nonexistent.txt failed.
```
