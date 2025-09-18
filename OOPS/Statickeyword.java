package OOPS;

 class Student {
    int roll;
    static String college = "ABC College";  // shared by all

    Student(int r) {
        roll = r;
    }

    void display() {
        System.out.println("Roll: " + roll + ", College: " + college);
    }
}

public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        s1.display();
        s2.display();
    }
}
   
