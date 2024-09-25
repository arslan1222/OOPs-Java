public class Interfaces{
    public static void main(String args[]){

        Queen q = new Queen();
        q.move();

        Bear b = new Bear();
        Chicken c = new Chicken();

        b.eat();
        c.eat();

    }
}

interface ChessPlayer{  
    void move();       // Abstraction -> we only defined method not implemented
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up, down, left, right, diagonal (in 4 drins)"+ "\n");
    }
}


class King implements ChessPlayer{
    public void move(){
        System.out.println("up, down, left, right, diagonal (in 1 drins)");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up, down");
    }
}


// ______________________________________________________________________

interface Herbivore{
    void eat();
}

interface Carnivore{
    void eat();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("bear can eat meat and grass!" + "\n");
    }
}

class Chicken implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Chicken can eat anything!");
    }
}
