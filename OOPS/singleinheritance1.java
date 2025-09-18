package OOPS;

public class singleinheritance1 {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat(); // inherited from Animal class
        shark.eat(); // inherited from Animal class
        shark.breathe(); // inherited from Animal class
        shark.swim(); // defined in fish class
    }

    
}


//base class {parent class}
class Animal {
     String color ;

     void eat (){
         System.out.println("eating...");
     }


         void breathe() {
                System.out.println("breathing...");
         }
     }

//derived class {child class}
class fish extends Animal {
    int fine;


    void swim() {
        System.out.println("swimming...");
    }
    
}