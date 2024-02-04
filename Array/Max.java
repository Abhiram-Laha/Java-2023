package Array;
import java.util.*;

public class Max{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter Size of Array : ");
        n = scan.nextInt();

        System.out.print("Enter Numbers : ");
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            arr.add(x);
        }

        int max=-100;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }

        System.out.print("\nMaximum Element : "+max);

    }
}