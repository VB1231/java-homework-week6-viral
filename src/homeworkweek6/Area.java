package homeworkweek6;

import java.util.Scanner;
/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
public class Area {
    static double pi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of radius :");
        int r = scanner.nextInt();
        System.out.println("Area is : " + (pi * r * r));
        scanner.close();
    }
}
