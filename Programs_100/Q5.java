//How to convert Fahrenheit to Celsius
//Program in java

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double f,c;
        System.out.print("Enter Temperature in Fahrenheit : ");
        f = scan.nextInt();

        c = ((f-32)*5)/9;
    
        System.out.println("\nTemperature in Celsius : "+c);

        scan.close();
    }
}
