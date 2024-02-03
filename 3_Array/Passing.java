package Array;

import java.util.Scanner;

public class Passing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n= scan.nextInt();

        int[] num = new int[n];

        System.out.print("Enter "+n+" Numbers : ");

        for(int i=0; i<num.length; i++){
            num[i] = scan.nextInt();
        }


        sq(num);

        System.out.print("\nUpdated Array : ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        
    }

    static void sq(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
    }
}
