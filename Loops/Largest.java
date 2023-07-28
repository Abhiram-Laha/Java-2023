package Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter Three Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int max = a;
        
        if (b > max){
            max = b;
        }

        if ( c > max ){
            max = c ;
        }

        System.out.println("Largest Number : "+max);
    }
    
}
