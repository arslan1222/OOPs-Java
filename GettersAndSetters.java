public class GettersAndSetters {

    public static void main(String args[]){
        
           // use of getters & setters
            
            Pen p1 = new Pen(); // Created an object p1 in heap
            p1.setColor("blue");  // Now, we can access private data 
            System.out.println(p1.getColor()); 
            p1.setTip(6);   // Now, we can access private data
            System.out.println(p1.getTip());
        
    }
}


class Pen {
    private String color;
    private int tip;


    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){  // Now, we can access private data
        this.color = newColor;
    }

    void setTip(int newTip){  // Now, we can access private data
        this.tip = newTip;
    }
}