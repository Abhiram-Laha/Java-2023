import java.util.* ;
import java.io.*;  
public class sum 
{    
    public static void checkEvenPartitioning(int n) {               
        
        
        // Write your code here    

        for(int i=1; i<n && i%2==0; i++){
            for(int j=1; i<n && j%2==0; i++){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        checkEvenPartitioning(6);
    }
}