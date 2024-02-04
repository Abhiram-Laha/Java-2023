package Array;

import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = Integer.parseInt(scan.nextLine());

        String str[] = new String[n];

        System.out.print("Enter "+n+" Strings : ");
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        for(int i=0; i<n; i++){
            System.out.print(str[i]+" ");
        }
    }
    
}
