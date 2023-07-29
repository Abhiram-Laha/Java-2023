// Find factorial for given no Program in Java

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,i,fac;

        System.out.print("Enter a Number : ");
        n = scan.nextInt();


        if(n<0){
            System.out.println("Negative Number.");
        }
        fac =1;
        if(n>0){
            for(i=1; i<=n; i++){
                fac = fac*i;
                //System.out.println(fac);
            }
        }

        System.out.println(n+"! = "+fac);
    }
}
