package PCA2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = scan.nextLine();

       if(Pal_Check(str)==1){
            System.out.println("This is Palindrome.");
       }
       else{
            System.out.println("This is Palindrome.");
       }


    }


    public static int Pal_Check(String str){

        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int m = str.length();

        for(int i=0; i<m/2; i++){
            if((str.charAt(i)) != str.charAt(m-1-i)){
                return 0;
            }
        }
        return 1;
    }
}
