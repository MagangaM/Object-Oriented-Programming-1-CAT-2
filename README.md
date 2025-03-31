# CAT 2 - BBT 1203 - Object Oriented Programming I

## Overview
This repository contains the solutions for CAT 2 of the Object-Oriented Programming I course (BBT 1203). The assignment demonstrates key OOP concepts in Java, including encapsulation, method overloading and overriding, abstraction, and exception handling.

## Instructions
To run the code, ensure you have Java installed and follow these steps:

1. Clone this repository:
   ```sh
   git clone <repository-url>
   ```
2. Navigate to the project folder:
   ```sh
   cd <project-folder>
   ```
3. Compile and run the program:
   ```sh
   javac Main.java
   java Main
   ```

## Code Breakdown
### **1. Encapsulation (Student.java)**
- Defines a `Student` class with private attributes (`name`, `grade`).
- Implements public getter and setter methods.
- Ensures `grade` is within 0-100; otherwise, it defaults to 0.

### **2. Method Overloading and Overriding (MathOperations.java & Animal.java)**
- `MathOperations` class includes two `multiply()` methods for method overloading.
- `Animal` class defines `makeSound()`, overridden in `Dog` and `Cat` subclasses to demonstrate polymorphism.

### **3. Abstraction (Appliance.java)**
- Defines an abstract class `Appliance` with an abstract method `turnOn()`.
- `Fan` and `TV` classes implement `turnOn()`.

### **4. Exception Handling (ExceptionHandlingDemo.java)**
- Accepts two numbers from the user.
- Handles division by zero using `try-catch` to catch `ArithmeticException`.
- Displays an appropriate message when division by zero occurs.

## Example Output
```sh
Enter first number: 10
Enter second number: 0
Cannot divide by zero!
```

## Submission Guidelines
- Ensure all Java files are included.
- The repository should be publicly accessible.
- Submit the GitHub repository link as per the CAT requirements.

## Author
Makau Nathan Maganga 

