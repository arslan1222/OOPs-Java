public class Inheritance{
    public static void main(String args[]){

        // Inheritance
        Fish shark = new Fish();
        // shark.eat();

        /* Multi Class Inheritance
        Goat tina = new Goat();
        tina.eat();
        tina.legs = 4;
        System.out.println(tina.legs); */

        // Heirarichial Inheritance

        Bird parrot = new Bird();
        parrot.eat();
    }
}

// Base class
class Animal{
    void eat(){
        System.out.println("Animal can eat!");
    }

    void walk(){
        System.out.println("Animal can walk!");
    }
}

/* ___________________________________Single Level Inheritance______________________________________ */

// Inheritance
/* Derived class / subclass
class Fish extends Animal{

    void swim(){
        System.out.println("Fish can swim");
    }
} */

/* _______________________________Multi Level Inheritance______________________________________ */

/* Multi Class Inheritance
class Mammal extends Animal{
    int legs;
} */

class Goat extends Mammal {
    String breed;
}

/* __________________________________Hierarichial Inheritance_______________________________________ */


class Mammal extends Animal{
    void walk(){
        System.out.println("Mammal can walk!");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Birds can fly!");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Fish can swim!");
    }
}

/* ___________________________________Hybrid Inheritance_____________________________________*/




/*_________________________________________Polymorphism________________________________________*/

// OOPs




