# Java Swing Multiplication Program

## Description

This Java program is a simple desktop application that uses **JOptionPane (Swing GUI)** to interact with the user. The program asks the user to enter two numbers, multiplies them, and displays the result. The process repeats until the user decides to exit.

The program also includes exception handling (`try-catch-finally`) to prevent the application from crashing if the user enters invalid data.

---

## Requirements

* Java JDK 8 or higher
* Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or terminal with `javac` and `java`

---

## How the Program Works

1. The program shows a dialog asking the user to enter the first number.
2. Then it asks for the second number.
3. The program multiplies both numbers.
4. The result is displayed in a message dialog.
5. The user is asked if they want to exit (`Y/N`).
6. If the user enters **Y**, the program ends.
7. If the user enters **N**, the program repeats.
8. If an error occurs (for example, entering text instead of numbers), the program shows an error message.
9. When the program finishes, a final message **"End process"** is displayed.

---

## Code Features

* `JOptionPane` for graphical input/output
* `do-while` loop for repetition
* `try-catch-finally` for error handling
* `Integer.parseInt()` for converting text to numbers

---

## How to Compile and Run (Terminal)

```bash
javac Main.java
java Main
```

---

## Example Execution

```
Please enter a number: 5
Now, enter second one: 4
Result: 20
Do you want exit? [Y/N]: N
```

```
Please enter a number: 3
Now, enter second one: 6
Result: 18
Do you want exit? [Y/N]: Y
End process
```

---

## Author

This program was created as a basic Java practice project to demonstrate loops, GUI input/output, and exception handling.
