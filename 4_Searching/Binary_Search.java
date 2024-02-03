package Searching;

public class Binary_Search {
    public static void main(String[] args) {

        int arr[] = {-100,-30,-21,-12,0,2,7,9,14,18,19,20,36,87,94,100,101,201};

        int target = 8;

        System.out.println(Search(arr, target));
        
    }


    static int Search(int arr[],int t){
        int start = 0, end = arr.length - 1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;


            if(arr[mid] == t){
                return mid;
            }
            else if(arr[mid] > t){
                end = mid - 1;
            }
            else if(arr[mid] < t){
                start= mid + 1;
            }
            
        }
        
        return -1;
    }
    
}
