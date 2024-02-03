package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};

        CyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void CyclicSort(int[] arr){
        int n=arr.length;


        int i=0;

        while(i<n){
            // value = index - 1
            int correct = arr[i]-1;
            
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        
    }

    private static void swap(int[] arr, int i, int correct) {
        
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

    
}
