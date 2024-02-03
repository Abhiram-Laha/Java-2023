package Array;

import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,9,8,6,7},
            {1,1,1},
            {2,5,9,7,6,3,4,2}
        };

        
        int[][] arr2 = new int[][]{{5, 2, 3, 1}, {7, 8, 9, 4}, {7, 8, 5}};

        for(int[] a:arr2){
            System.out.print(Arrays.toString(a)+"\n");
            
        }
        
    }
}
