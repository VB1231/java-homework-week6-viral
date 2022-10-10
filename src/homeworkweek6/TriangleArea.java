package homeworkweek6;

import java.util.Scanner;
/*
8. Write a program to calculate the area of a triangle.
 */

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of triangle : ");
         float a = scanner.nextFloat();
        System.out.println("Enter base of triangle :");
         float b = scanner.nextFloat();
         float c = (a*b)/2;
        System.out.println("Area of triangle is :"+c);
        scanner.close();
    }
}
