package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};

        Insertion(arr);

        System.out.println(Arrays.toString(arr));
    }


    static void Insertion(int[] arr){

        for (int i=0; i<arr.length-1; i++){

            for(int j=i+1; j>0; j-- ){

                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
                
            }
        }
    }

    static void swap(int num[],int a,int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}
