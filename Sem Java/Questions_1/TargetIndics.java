package Questions_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndics {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 7;

        Sorting(nums);  // Step-1 : Sort the given array

        System.out.println(targetIndices(nums, target));

        

        
    }

    static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<Integer>(10);

        ans.add(Search(nums, target, true));
        ans.add(Search(nums, target, false));

        if(ans.get(0)==-1){
            ans.clear();
        }

        if(ans.size()>=2){
            if(ans.get(0)==ans.get(1)){
                int k = ans.get(0);
                ans.clear();

                ans.add(k);
                return ans;
            }
            
        }

        

        return ans;
    }




    static int Search(int nums[],int target,boolean findstart){
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int ans=-1;


        while(start<=end){
            mid = (start + end)/2;

            if(target>nums[mid]){
                start = mid + 1;
            }
            else if(target<nums[mid]){
                end = mid - 1;
            } 
            else{
               ans = mid;

               if(findstart){
                end = mid - 1;
               }
               else{
                start = mid + 1;
               }
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
