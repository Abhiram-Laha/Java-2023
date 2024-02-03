package Sorting;

import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums = {5,4,1,2,3};
        Selection(nums);

        System.out.println(Arrays.toString(nums));
    }


    public static void Selection(int[] arr){

        for (int i=0; i<arr.length; i++){
            int last = arr.length - i -1;
            int maxindex = max_index(arr,0,last);
            swap(arr,maxindex,last);
        }
    }


    public static int max_index(int[] arr,int start,int last){
        int max = start;

        for (int i=0; i<=last; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }


    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
