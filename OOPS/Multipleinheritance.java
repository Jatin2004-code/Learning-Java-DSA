package OOPS;

public class Multipleinheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        Dog tommy = new Dog();
        tommy.eat();
        tommy.legs = 4;
        System.out.println(tommy.legs);
        shark.eat();

    }
}

//base class
class Animal {
 String color;
  
 void eat(){
 System.out.println("eats");

}

void breathe(){
System.out.println("breathes");

}
}


//derive class / sub class
class Fish extends Animal{
    int Fish;

    void swim(){
        System.out.println("swims");
    }
}


//derived class
class mammal extends Animal{
    int legs;
}

class Dog extends mammal {
    String breed;
}


// derived class
