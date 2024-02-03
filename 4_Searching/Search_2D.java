package Searching;

public class Search_2D {
    public static void main(String[] args) {
        int arr[][] = {
            {12,65,97,21,2},
            {10,12,36,98,77,8,9},
            {1,2,3,4,5,6,7,8,9,10}
        };

        int target = 7;

        Find(arr,target);
    }

    static void Find(int arr[][],int t){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if (t == arr[i][j]){
                    System.out.println("Row : "+(i+1)+"\nCol : "+(j+1));
                }
            }
        }
    }
}
