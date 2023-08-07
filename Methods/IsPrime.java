package Methods;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println(isprime(18));
        
    }


    static boolean isprime(int n){
        if(n<0){
            n = n*(-1);
        }
        if(n==1){
            return false;
        }
        if(n==2 && n==3){
            return true;
        }
        if(n%2==0){
            return false;
        }

        
        
        for(int i=3; i<(int)Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
        
    }
}
