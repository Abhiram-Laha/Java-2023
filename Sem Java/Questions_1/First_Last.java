package Questions_1;

import java.util.Arrays;

public class First_Last {
    public static void main(String[] args) {

        int [] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target))); 

        //System.out.println(Arrays.toString(Linear(nums, target))); 
        
    }

    static int[] Linear(int[] nums, int target){

        int k=0,y=0;
            for (int i=0 ;i<nums.length; i++ ){
                if ((target == nums[i])){
                    k=i;

                    for(int j=k+1; j<nums.length; j++){
                        if(nums[j]!=target){
                            y=j-1;
                        }
                    }
                    int a[] = {k,y};
                    return a;
                }

            }

            int[] b ={-1,-1};
            return b;
    }



    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        ans[0] = Search(nums, target, true);
        ans[1] = Search(nums, target, false);

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
}
