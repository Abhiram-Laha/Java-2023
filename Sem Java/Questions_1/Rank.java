package Questions_1;
import java.util.*;

public class Rank {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};

        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    static int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<Integer>(10);
        int n =arr.length;
        int[] num = new int[n];

        int k=1;

        Sorting(arr);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                ans.add(k);
            }
            if(arr[i]!=arr[i+1]){
                ans.add(k);
                k++;
            }
            
        }

        

        for(int i=0; i<ans.size(); i++){
           num[i] = ans.get(i);
        }

        if(arr[n-1]!=arr[n-2]){
            num[n-1]=k;
         }
        
         if(arr[n-1]==arr[n-2]){
            num[n-1]=k;
         }


        return num;
        
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
