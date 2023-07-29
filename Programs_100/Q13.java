// How to check Odd and Even Number in java

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Enter a Number : ");
        n = scan.nextInt();

        if ( n%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        
    }
}
