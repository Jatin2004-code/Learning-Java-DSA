package ArrayList;

import java.util.ArrayList;  
// → Java library se ArrayList class import kar rahe hain

public class ReverseArrayList {  
// → Class ka naam ReverseArrayList rakha hai

    public static void main(String[] args) {  
    // → Program execution yahin se start hota hai

        ArrayList<Integer> list = new ArrayList<>();  
        // → Integer type ka ek ArrayList banaya
        // → Abhi list empty hai

        list.add(10);  
        // → list me 10 add kiya

        list.add(20);  
        // → list me 20 add kiya

        list.add(30);  
        // → list me 30 add kiya

        list.add(40);  
        // → list me 40 add kiya

        System.out.println("Original ArrayList: " + list);  
        // → Original order me list print ki

        System.out.println("Reverse ArrayList:");
        // → Reverse print ka message

        for(int i = list.size() - 1; i >= 0; i--) {  
        // → Loop last index se start ho raha hai
        // → i-- matlab peeche ki taraf ja rahe hain

            System.out.print(list.get(i) + " ");  
            // → Har element ko reverse order me print kar rahe hain
        }
    }
}
