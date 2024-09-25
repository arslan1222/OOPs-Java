public class Polymorphism{
    public static void main(String args[]){

        Calculator func = new Calculator();

        /* Method overloading
        System.out.println(func.sum(4,5));
        System.out.println(func.sum(4,5,6));
        System.out.println(func.sum(2.7f, 3.3f));
        System.out.println(func.sum(4.3, 5.7));
        */

        Goat eating = new Goat();
        Animal eatings = new Animal();

        eatings.eat();




    }
}


// Method overloading
class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    double sum(double a, double b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }
}

// Method overriding

class Animal{
    void eat(){
        System.out.println("Animal can eat anything!");
    }
}

class Goat extends Animal{
    void eat(){
        System.out.println("Goat can eats grass!");
    }
}