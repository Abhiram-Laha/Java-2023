package Array;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(10);

        arr.add(10);
        arr.add(7);
        arr.add(18);
        arr.add(12);  // APPEND ELEMNET

        System.out.println(arr.size());

       
        arr.clear();  // REMOVE ALL ELEMENTS

        System.out.println(arr);

       

    }
}
