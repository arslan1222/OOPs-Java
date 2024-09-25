public class Abstraction{
    public static void main(String args[]){

        // Animal a = new Animal(); // Animal is abstract; cannot be instantiated

        Lion l = new Lion();
        
        l.eat();
        l.walk();
        l.changeColor();

        System.out.println(l.color);  // By default the color will be parent class color bcz we make the child object class

        Birds b = new Birds();

        b.eat();
        b.walk();



    }
}

// Absract classes

abstract class Animal{

    // Astract class can have Constructors

    String color = "Brown";


    void eat(){
        System.out.println("Animal eats!");
    }

    abstract void walk();  // We only give the idea not implementation 
}


class Lion extends Animal{

    void changeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("Lion walks on 4 legs!");
    }
}

class Birds extends Animal{
    void walk(){
        System.out.println("Birds walk on 2 legs!");
    }
}
