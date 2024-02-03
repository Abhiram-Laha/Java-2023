package Searching;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = {8,7,6,4,2,1,55,87,90,12,14,80,60,45,77,91,100};

        System.out.print("Enter Target Element : ");
        int target = scan.nextInt();

        if(Search(arr, target)){
            System.out.println("Element Present.");
        }
        else{
            System.out.println("Element Not Found.");
        }


        scan.close();
    }

    static boolean Search(int arr[],int t){

        if(arr.length == 0){
            return false;
        }

        for(int i=0; i<arr.length; i++){
            if (t == arr[i]){
                return true;
            }
        }

        return false;
    }
}
