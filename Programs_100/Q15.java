// How to compare 2 string in Java program

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1,str2;

        System.out.print("Enter a String 1 : ");
        str1 = scan.nextLine();

        System.out.print("Enter a String 2 : ");
        str2 = scan.nextLine();

        if (str1.compareTo(str2) > 0){
            System.out.println("\n"+str1+" is Greater. ");
        }
        else if (str1.compareTo(str2) < 0){
            System.out.println("\n"+str2+" is Greater. ");
        }
        else{
            System.out.println("\nBoth Strings are Equal. ");
        }

        scan.close();
    }
}
