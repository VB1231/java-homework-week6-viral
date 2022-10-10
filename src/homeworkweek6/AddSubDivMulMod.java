package homeworkweek6;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.Scanner;
/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
        remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */

public class AddSubDivMulMod {
    public static void main(String[] args) {
        AddSubDivMulMod d = new AddSubDivMulMod();
        System.out.println("Enter Value for Addition :");
        Add();
        System.out.println("Enter Value for Subtraction :");
        Sub();
        System.out.println("Enter value for Multiplication :");
        d.Mul();
        System.out.println("Enter value for Division :");
        d.Div();
        System.out.println("Enter value for finding Mod :");
        M1();
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

    }
    public static void M1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter value of A :" + a);
        System.out.println("Enter value of B :" + b);
        System.out.println("Division :" +(a%b));
        scanner.close();

    }
}
