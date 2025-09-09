package OOPS;

public class bluepen {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);


        BankAccount myAccount = new BankAccount();
        myAccount.username = "jatinkanojiya";
        myAccount.setpassword("jatin@2004");
        
    }
    
}

class pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
    tip = newTip;
}
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password = pwd ;
    }
}