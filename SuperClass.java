public class SuperClass{
    public static void main(String args[]){

        Lion l = new Lion();

        System.out.println(l.color);


        
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called!");
    }
}


class Lion extends Animal{
    Lion(){
        super(); // If we not define here super then java by default called the super class constructor
        super.color = "brown"; // We can chage super class properties
        System.out.println("Lion constructor is called!");
    }
}