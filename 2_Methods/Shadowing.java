//  shadowing occurs when a variable declared in a certain scope (e.g. a local variable) has the same name as a variable in an 
//  outer scope (e.g. a global variable). When this happens, the outer variable is said to be shadowed by the inner variable.

package Methods;

public class Shadowing {
    static String name = "Abhiram";  //outer scope of class
    static int n = 14;
    public static void main(String[] args) {
        System.out.println("Outer Scope : "+name);
        System.out.println("Outer Scope : "+n);

        int n;  //declared variale, it will shawod the outer scope
        n = 60;

        name = "Ram";        // glogal variale can be modified/changed

        System.out.println("After Shadowing : "+n);
        System.out.println("Outer Scope : "+name);

    }
    
}
