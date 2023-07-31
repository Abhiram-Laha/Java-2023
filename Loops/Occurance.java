package Loops;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n,count,rem;
        System.out.print("Enter a Digit : ");
        n = scan.nextInt();

        int k = 1875114131;

        count = 0;

        while(k>0){
            rem = k % 10;

            if(rem==n){
                count++;
            }

            k/=10;
        }

        System.out.print("Occurence of "+n+" : "+count);


    }
    
}
