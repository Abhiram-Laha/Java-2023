import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i;
        float f;
        String s;

        System.out.print("Enter a String : ");
        s = scan.nextLine();

        System.out.print("Enter a Integer : ");
        i = scan.nextInt();

        System.out.print("Enter a Float : ");
        f = scan.nextFloat();

       

        System.out.println("Integer : "+i+"\nFloat : "+f+"\nString : "+s);

        scan.close();
    }
}
