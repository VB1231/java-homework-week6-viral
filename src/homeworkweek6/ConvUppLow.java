package homeworkweek6;

import java.util.Scanner;
/*
19. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */
public class ConvUppLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name in uppercase :");
        String s = scanner.nextLine();
        System.out.println("Converted name in lower case:" + s.toLowerCase());
        scanner.close();

    }
}
