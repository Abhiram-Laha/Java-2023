package Loops;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,choice;

        System.out.print("Enter 1st Number : ");
        a = scan.nextInt();

        System.out.print("Enter 2nd Number : ");
        b = scan.nextInt();

        System.out.print("Enter Operation (+,-,*,/) : ");
        choice = scan.next().charAt(0);

        if(choice == '+'){
            System.out.print("Sum is : "+(a+b));
        }
        else if(choice == '-'){
            System.out.print("Subtraction is : "+(a-b));
        }
        else if(choice == '*'){
            System.out.print("Multiplication is : "+(a*b));
        }
        else if(choice == '/'){
            System.out.print("Division is : "+(a/b));
        }




    }
}
