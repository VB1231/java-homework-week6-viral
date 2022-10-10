package homeworkweek6;
/*16. Write a Java program to add two binary numbers.
 Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
 import java.util.Scanner; */

import java.util.Scanner;

public class AddBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number :");
        String a = scanner.nextLine();
        System.out.println("Enter second binary number :");
        String b = scanner.nextLine();
        String c = add(a, b);
        System.out.println("Addition of two Binary number is :" + c);
        scanner.close();
    }

    public static String add(String a, String b) {
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);


    }
}
