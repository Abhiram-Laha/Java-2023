// How to swap 2 no without using 3rd variable Program in java

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.print("Enter a : ");
        a = scan.nextInt();

        System.out.print("Enter b : ");
        b = scan.nextInt();

        System.out.print("Number Before Swapping : \na : "+a+"\nb : "+b);

       a = a + b;
       b = a-b;
       a = a-b;

        System.out.print("\nNumber After Swapping : \na : "+a+"\nb : "+b);
    }
}
