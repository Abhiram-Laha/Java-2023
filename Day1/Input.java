package Day1;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        System.out.println("Welcome to my Java Program : ");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int a = scan.nextInt();

        System.out.print("Enter 2nd Number : ");
        int b = scan.nextInt();

        System.out.print("Sum of the two Numbers is : "+(a+b));

        scan.close();
    }
}
