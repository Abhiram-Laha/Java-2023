package PCA2;

import java.util.Scanner;

public class Sort_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[5];

        System.out.println("Enter 5 words : ");
        for(int i=0; i<5; i++){
            System.out.print("Word "+(i+1)+" : ");
            arr[i] = scan.next();
        }

        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted Words : ");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
