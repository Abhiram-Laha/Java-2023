package Methods;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        int m = sum();
        System.out.println("Sum is : "+m);
        
    }

    /*static void sum(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 1st Number : ");
        int a=scan.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=scan.nextInt();

        int sum = a+b;
        System.out.println("The Sum is : "+sum);
        scan.close();
    }*/

    static int sum(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 1st Number : ");
        int a=scan.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=scan.nextInt();

        return a+b;

    }
}