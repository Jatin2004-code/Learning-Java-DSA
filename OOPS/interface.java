package OOPS;

class InterfaceDemo {
    public static   void main(String[] args) {
        queen q = new queen();
        q.move();

}
}

interface chessPlayer {
    void move ();
}

class queen implements chessPlayer {
    public void move () {
        System.out.println("up, down, left, right, digonal (in all 4 diraction)");
    }
}

class Rook implements chessPlayer {
    public void move () {
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer {
    public void move () {
        System.out.println("up, down, left, right, digonal (by 1 step)");
    }
}