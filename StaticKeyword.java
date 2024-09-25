public class StaticKeyword{
    public static void main(String args[]){

        Books b = new Books();

        b.author = "Naseem Hijazi";
        
        System.out.println(b.author);

        b.title = "Dastan e Mujahid!";

        System.out.println(b.title);

        // object 2

        Books b2 = new Books();

        b2.title = "Banaris";
        System.out.println(b2.title);

        // Now title is pointing on Banaris
        System.out.println(b.title);




    }
}

class Books{
    String author;

    static String title;

    

    void setName(String author){
        this.author = author;
    }

    String getName(){
        return this.author;
    }

    
}