package OOPS;

// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class C implements both interfaces
class C implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }

    public void methodC() {
        System.out.println("Method C from Class C");
    }
}

// Class D inherits from C
class D extends C {
    public void methodD() {
        System.out.println("Method D from Class D");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();  // from interface A
        obj.methodB();  // from interface B
        obj.methodC();  // from class C
        obj.methodD();  // from class D
    }
}
