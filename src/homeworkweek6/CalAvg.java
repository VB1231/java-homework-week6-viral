package homeworkweek6;

import java.util.Scanner;
/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class CalAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of first number :");
        int a = scanner.nextInt();
        System.out.println("Enter value of second number :");
        int b = scanner.nextInt();
        System.out.println("Enter value of third number :");
        int c = scanner.nextInt();
        System.out.println("Average of all three number is :"+((a+b+c)/3));
        scanner.close();
    }
}
