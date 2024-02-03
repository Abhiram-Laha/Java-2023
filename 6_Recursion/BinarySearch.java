package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int s=0;
        int e=arr.length - 1;

        System.out.println(search(arr,9,s,e));
        
    }

    public static int search(int[] nums, int target,int start,int end) {

        if(start>end){
            return -1;
        }
        
        int mid = start + (end-start)/2;

        if(nums[mid] == target){
            return mid;
        }

        if(nums[mid] > target){
            return search(nums, target, start, mid-1);
        }

        return search(nums, target, mid+1, end);

        
    }
}
