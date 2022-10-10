package homeworkweek6;

import java.util.Scanner;
/*
9. Write a program to convert the upper case to lower case.
 */

public class ConvCharUtoL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name in uppercase :");
        String s = scanner.nextLine();
        System.out.println("Converted name in lower case:" + s.toLowerCase());
        scanner.close();
    }
}
