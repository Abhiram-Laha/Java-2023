package Array;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Enter Size of Array : ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter "+n+" Numbers : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Given Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
