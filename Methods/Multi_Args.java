package Methods;
import java.util.Arrays;
public class Multi_Args{
    public static void main(String[] args) {
        
        prime(2,3,5,7,9,11,13,17,19);
        names("raj","ram","rahul","ravi","rohan");
    }

    static void prime(int ...v){          // it take a array of number

        System.out.println(Arrays.toString(v));
    }

    static void names(String ...n){   // it take a array of strings
        System.out.println(Arrays.toString(n));
    }
}