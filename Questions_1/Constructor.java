public class Constructor {

    Constructor(){
        System.out.println("Default Constructor Called");
    }
    Constructor(int x){
        System.out.println("Parameterized (int) Constructor Called. \nNumber : "+x);
    }

    
    Constructor(String name){
        System.out.println("Parameterized (String) Constructor Called. \nName : "+name);
    }
    public static void main(String[] args) {
        Constructor ob1 = new Constructor();
        Constructor ob2 = new Constructor(7);
        Constructor ob3 = new Constructor("Abhiram");

    }
}
