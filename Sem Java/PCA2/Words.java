package PCA2;

import java.util.Scanner;

public class Words {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String input = scan.nextLine();

        String[] words = input.split(" ",200);
        

        if(words.length==0){
            System.out.println("Empty String");
        }
        else{
            String max = words[0];
            String min = words[0];

            for(String i:words){
                if(i.length() < min.length()){
                    min = i;
                }
                if(i.length() > max.length()){
                    max = i;
                }
            }

            System.out.println("Largest String : "+max+"\nSmallest String : "+min);
        }

        scan.close();

        
    }
}
