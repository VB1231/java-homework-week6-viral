package homeworkweek6;

import java.util.Scanner;
/*
17. Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */
public class DeciBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numeric value:");
        int a = scanner.nextInt();
        String c = con(a);
        System.out.println("Converted numeric to binary value is :" + c);

    }
    public static String con(Integer a) {
             return Integer.toBinaryString(a);
    }
}
