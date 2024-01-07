package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};
        Bubble(nums);

        System.out.println("Sorted Array : "+Arrays.toString(nums));
    }


    static void Bubble(int[] arr){

        // modify for sorted array if passed

        boolean swapped = false;

        // no. of pass will be 'i' = 'n-1'
        int n = arr.length;
        for(int i=0; i<n-1; i++){

            // no. of comparsion of internal loop will be till 'n-i'

            for(int j=1; j<n-i; j++){

                //swap the element if it is smaller than previous element

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }

            if(swapped!=true){
                break;
            }
        }
    }
}
