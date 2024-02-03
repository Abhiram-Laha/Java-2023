package Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int m = scan.nextInt();        

        if(ArmStrong(m)){
            System.out.println(m+" is a Armstrong Number.");
        }
        else{
            System.out.println(m+" is not a Armstrong Number.");
        }
    }


    static boolean ArmStrong(int n){
        int sum=0;
        int rem,temp = n;

        while(temp>0){
            rem = temp%10;
            sum = sum + (rem*rem*rem);
            temp = temp/10;
        }


        if(sum!=n){
            return false;
        }

        return true;
    }
}
