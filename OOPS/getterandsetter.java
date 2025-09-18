package OOPS;

public class getterandsetter {
    public static void main(String[] args) {
    pen p1 = new pen();
    p1.setcolor("blue");
    System.out.println(p1.getcolor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setcolor("yellow");
    System.out.println(p1.getcolor());
    }
    
}
 class pen{
    String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color = newcolor;

  
    }

    void setTip(int tip){
        this.tip = tip;
    }
 }