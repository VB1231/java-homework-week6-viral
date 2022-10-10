package homeworkweek6;

import java.util.Scanner;
/*
14. Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class RectAreaPera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of Rectangle :");
        double w = scanner.nextDouble();
        System.out.println("Enter height of Rectangle :");
        double h = scanner.nextDouble();
        System.out.println("Area of Rectangle is :" + (w * h));
        System.out.println("Perimeter of Rectangle is :" + (2 * (w + h)));
    }
}
