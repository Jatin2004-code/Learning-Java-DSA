package OOPS;

import java.net.SocketPermission;

public class Oopsbasic {
    public static void main(String[] args) {
    pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

    
    }


}

class pen{

    String color;
    int tip;

     void setColor(String newcolor){
        color = newcolor;
     }

   void setTip(int newtip){
       tip = newtip;
   }
}

class student{
    String name;
    int age;
    float percentage;

    void setName(String newname){
        name = newname;
    }

    void setAge(int newage){
        age = newage;
    }
    void setpercentage(int phy , int chem , int math ){
        percentage = (phy + chem + math) / 3.0f;
    }
}

