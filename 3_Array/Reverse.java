package Array;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int n = scan.nextInt();
        

        int arr[] = new int[n];

        System.out.print("Enter Element : ");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Array Before :"+Arrays.toString(arr));

        for (int i = 0; i < n / 2; i++) {
            int k = n - 1 - i;
            swap(arr, i, k);
        }
        

        System.out.println("\nArray After :"+Arrays.toString(arr));

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
