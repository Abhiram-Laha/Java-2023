package Recursion;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        Sum(arr,n);
        
    }

    public static void Sum(int[] arr,int n){
        if(n<2){
            return;
        }

        int[] new_arr = new int[n-1];

        for(int i=0; i<n-1; i++){
            new_arr[i]=arr[i]+arr[i+1];
        }

        Sum(new_arr,n-1);

        System.out.println(Arrays.toString(new_arr));
    }
}
