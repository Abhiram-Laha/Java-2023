package Loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char k;

        System.out.print("Enter a Character : ");
        k = scan.next().trim().charAt(0);

        if (k>='a' && k<='z'){
            System.out.println("Lowercase");
        }
        else if (k>='A' && k<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Invalid Input");
        }

        scan.close();

    }

}
