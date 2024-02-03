package Methods;

public class Overloading {
    public static void main(String[] args) {

        add();
        int n = add(40,20);
        System.out.println(n);

        add(20,10.0);
        add(10,10,10);
        
    }

    static void add(){
        System.out.println("This is the default method");
    }

    static int add(int a,int b){
        return (a+b); //return statement can be used only in methods that have an explicit
    }

    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    static void add(double a,double b){
        System.out.println(a+b);
    }
}
