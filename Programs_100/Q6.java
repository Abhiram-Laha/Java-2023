// How to swap 2 no using 3rd variable Program in java

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.print("Enter a : ");
        a = scan.nextInt();

        System.out.print("Enter b : ");
        b = scan.nextInt();

        System.out.print("Number Before Swapping : \na : "+a+"\nb : "+b);

        int temp;
        temp =a ;
        a = b;
        b = temp;

        System.out.print("\nNumber After Swapping : \na : "+a+"\nb : "+b);
        
    }   
}
