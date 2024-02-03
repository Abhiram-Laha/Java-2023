import java.util.*;

public class Delete {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String m;
        System.out.print("Enter a String : ");
        m=scan.nextLine();
        

       StringBuilder str = new StringBuilder(m);
       
       System.out.print("Enter nth : ");
       int n = scan.nextInt();
       n=n-1;
       
       str.delete(n,n+1);
       System.out.print("String : "+str);
    }
}