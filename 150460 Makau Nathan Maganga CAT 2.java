// Question 1a: Encapsulation
class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }
} 

// Question 1b: Method Overloading and Overriding
class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Question 2a: Abstraction
abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is now on.");
    }
}

class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is now on.");
    }
}

// Question 2b: Exception Handling
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
