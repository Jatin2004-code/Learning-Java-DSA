package ArrayList;

import java.util.ArrayList;  
// → ArrayList class ko import kar rahe hain

public class MultiDimensionalArrayList {  
// → Class ka naam

    public static void main(String[] args) {  
    // → Program execution yahin se start hota hai

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  
        // → 2D ArrayList banayi
        // → Matlab: ArrayList ke andar ArrayList

        ArrayList<Integer> row1 = new ArrayList<>();  
        // → Pehli row ke liye ek ArrayList banayi

        row1.add(10);  
        // → row1 me 10 add kiya

        row1.add(20);  
        // → row1 me 20 add kiya

        row1.add(30);  
        // → row1 me 30 add kiya

        ArrayList<Integer> row2 = new ArrayList<>();  
        // → Dusri row ke liye ek ArrayList banayi

        row2.add(40);  
        // → row2 me 40 add kiya

        row2.add(50);  
        // → row2 me 50 add kiya

        row2.add(60);  
        // → row2 me 60 add kiya

        list.add(row1);  
        // → row1 ko main 2D list me add kiya

        list.add(row2);  
        // → row2 ko main 2D list me add kiya

        System.out.println(list);  
        // → Puri 2D ArrayList print karega
    }
}
