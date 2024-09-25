public class CopyConstructor{
    public static void main(String args[]){

        Student st1 = new Student();
        st1.name = "Arslan";
        st1.age = 22;
        st1.marks[0] = 94;
        st1.marks[1] = 95;
        st1.marks[2] = 96;


        Student st2 = new Student(st1);
        System.out.println(st2.name);

        st1.marks[2] = 97;  // changed in shallow copy constructor

        for(int i=0; i<3; i++){
            System.out.println(st2.marks[i]);
        }

    }
}

class Student{
    String name;
    int age;
    int marks[];

    Student(){
        marks = new int[3];
    }

    /* Shallow Copy Constructor  => changes Reflect -> Copy only references

    Student(Student st1){
        marks = new int[3];
        this.name = st1.name;
        this.age = st1.age;
        this.marks = st1.marks;
    }
    */
    

    // Deep Copy Constructor -> Changes not reflect

    Student(Student s1){   // We can given any name to this parameter object
        marks = new int[3];
        this.name= s1.name;
        this.age = s1.age;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

}