package Questions_1;

import java.util.ArrayList;
import java.util.*;

public class Lin {
    public static void main(String[] args) {

        int[] arr = {75,99,19,93,87,68,12,18,48,83,24,50,16,53,36,16,80,68,46,13,53,100,50,49,77,52,34,42,38,98,73,11,13,61,72,8,11,67,98,24,23,71,47,6,5,7,97,86,25,82,11,15,26,97,69,6,30,77,98,44,32,39,71,47,64,78,6,61,72,75};
        int target = 98;

        int[] arr1 = {8,6,7,9,2,1,2,7,2,9,2};

        System.out.println(targetIndices(arr, target));
    }



    static List<Integer> targetIndices(int[] nums, int target) {
        
        Sorting(nums);


        ArrayList<Integer> ans = new ArrayList<Integer>(10);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }

        return ans;
    }

    static void Sorting(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
