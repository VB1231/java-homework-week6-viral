package homeworkweek6;

import java.util.Scanner;
/*
7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Temp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter value of Fahrenheit :");
       float f = scanner.nextFloat();
      int  p = 5;
     int  q = 9;
      int c = 32;
      float d = (((f-c)*p)/q);
        System.out.print("Converted into Celsius : " +d);
        scanner.close();
        //System.out.println("Value of d :"+m);
    }
}
