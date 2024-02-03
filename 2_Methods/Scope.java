package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10, b=25 ;

        {   
            int x=60;
            System.out.println("Inside the scope of block");
            System.out.println(a+"\n"+b+"\n"+x);
        }

        //System.out.println(x); variale can not be accessed outside block of code

        Sqr(a);


        // Scope of Loop

        for(int i=1; i<=5; i++){          // here, i can only be accessed within the loop only 
            System.out.println("Hello Abhiram !! ");
        }


        // a = i ;  i can not be accessed outside the loop

    }

    static void Sqr(int x){
        System.out.println("Inside the scope of Method");
        System.out.println(x*x);

        //x = x + b;     b can not be accessed from this method
    }
}
