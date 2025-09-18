package OOPS;


class Calculator {
    // 1st version
    int add(int a, int b) {
        return a + b;
    }

    // 2nd version
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloadinge {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum 2 numbers: " + c.add(10, 20));
        System.out.println("Sum 3 numbers: " + c.add(10, 20, 30));
    }
}
