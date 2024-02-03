package Searching;

public class Richest_Customer {
    public static void main(String[] args) {

        int arr[][] = {
            {1,2,3},
            {3,2,1}
        };

        System.out.println(maximumWealth(arr));
        
    }


    static int maximumWealth(int[][] accounts) {
        int max = 0,sum = 0;

        for(int i=0; i<accounts.length; i++){
            sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }

            if(max<sum){
                max = sum;
            }
        }

        return max;
    }
}
