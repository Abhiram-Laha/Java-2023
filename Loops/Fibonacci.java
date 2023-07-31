package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 0 1 1 2 3 5 8 13

                int a,b,s,count;
                a = 0;
                b = 1;
                int n;

                System.out.print("Enter Total Terms : ");
                n = scan.nextInt();

                System.out.print("Fibonacci Series : ");

                System.out.print(a+" "+b+" ");

                count = 2;

                while(count<=n){
                    s = a+b;
                    System.out.print(s+" ");
                    a = b;
                    b = s;

                    count++;

                   
                }
    }
    
}
