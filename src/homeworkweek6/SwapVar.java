package homeworkweek6;

import java.util.Scanner;
/*
15. Write a Java program to swap two variables.
 */
public class SwapVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap value of A & B :");
        int a = scanner.nextInt();
        System.out.println("Value of A is :" + a);
        int b = scanner.nextInt();
        System.out.println("Value of B is :" + b);
        System.out.println("After Swap value :");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of A is :" + a);
        System.out.println("Value of B is :" + b);
    }


}
