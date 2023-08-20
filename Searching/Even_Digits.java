package Searching;

public class Even_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }


    static int findNumbers(int[] nums) {
        int c = 0;
        
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int k=0;

            while(n>0){
                k++;
                n=n/10;
            }

            if(k%2==0){
                c++;
            }

        }

        return c;
    }
    
}
