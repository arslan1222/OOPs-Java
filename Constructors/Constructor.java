public class Constructor {

    public static void main(String args[]){


        Student st1 = new Student();
        Student st2 = new Student(22);
        System.out.println(st2.age);

        Student st3 = new Student("Arslan", 22);
        System.out.println(st3.name);

    }

}

class Student{
    String name;
    int age;

    /* Constructor Overloading -> Polymorphism */ 

    // Non-Parametrized constructor
    Student(){
        System.out.println("Non-Parametrized Constructor is called!");
    }

    // Parameterized constructor
    Student(int age){
        this.age = age;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}