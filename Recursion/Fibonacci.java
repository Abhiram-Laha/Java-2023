package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int k = Fib(4);
        System.out.println(k);
    }

    public static int Fib(int n) {
        if(n==1){
            return 1;
        }

        if(n==0){
            return 0;
        }

        return Fib(n-1) + Fib(n-2);
    }
}

