package PCA2;

interface Player{
    void play();
}

class Child implements Player{
    @Override
    public void play(){
        System.out.println("The Child is Playing with the Toys.");
    }
}


class Musician implements Player{
    @Override 
    public void play(){
        System.out.println("The Musician is Playing Guitar.");
    }
}


class Actor implements Player{
    @Override
    public void play(){
        System.out.println("The Actor is Playing his Role in the Movie.");
    }
}

class Over{
    public static void main(String[] args) {

        Child ob1 = new Child();
        Musician ob2 = new Musician();
        Actor ob3 = new Actor();


        ob1.play();
        ob2.play();
        ob3.play();
        
    }
}