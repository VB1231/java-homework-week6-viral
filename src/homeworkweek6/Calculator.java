package homeworkweek6;

import java.util.Scanner;
/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
public class Calculator {
    public static void main(String[] args) {
        Calculator d = new Calculator();
        System.out.println("Enter Value for Addition :");
        Add();
        System.out.println("Enter Value for Subtraction :");
        Sub();
        System.out.println("Enter value for Multiplication :");
        d.Mul();
        System.out.println("Enter value for Division :");
        d.Div();
    }

    public static void Add() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter Value A :" + a);
        System.out.println("Enter Value B :" + b);
        System.out.println("Addition :" + (a + b));
    }

    public static void Sub() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter value of A :" + a);
        System.out.println("Enter value of B :" + b);
        System.out.println("Subtraction :" + (a - b));
    }

    public void Mul() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter Value of A :" + a);
        System.out.println("Enter Value of B :" + b);
        System.out.println("Multiplication :" + (a * b));

    }

    public void Div() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter value of A :" + a);
        System.out.println("Enter value of B :" + b);
        System.out.println("Division :" + (a / b));
        scanner.close();

    }
}
