package Searching;

public class Min_Max {
    public static void main(String[] args) {
        int arr[] = {1,5,7,8,6,3,1,17,56,98,77,11,89,10,23,0,-101};
        System.out.println("Max: "+max(arr)); 
        System.out.println("Min: "+min(arr)); 
    }

    static int min(int arr[]){
        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        return min;
    } 

    static int max(int arr[]){
        int max = arr[0];

        for(int j=1; j<arr.length; j++){
            if(max<arr[j]){
                max = arr[j];
            }
        }

        return max;
    }
    
}
