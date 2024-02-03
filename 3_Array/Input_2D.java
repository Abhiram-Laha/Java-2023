package Array;

import java.util.Scanner;

public class Input_2D {
    public static void main(String[] k) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter Matrix : ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=scan.nextInt();
            }
        }

        System.out.println("\nGiven Matrix : ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");//=scan.nextInt();
            }
            System.out.println();
        }
    }
}
