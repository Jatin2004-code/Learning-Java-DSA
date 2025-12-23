package ArrayList;

import java.util.ArrayList;  
// → Java library se ArrayList class import kar rahe hain

public class ArrayListOperations {  
// → Class ka naam ArrayListOperations rakha hai

    public static void main(String[] args) {  
    // → Program execution yahin se start hota hai

        ArrayList<Integer> list = new ArrayList<>();  
        // → Integer type ka ek ArrayList banaya
        // → Abhi list empty hai

        // -------- ADD OPERATION --------
        list.add(10);  
        // → list ke end mein 10 add kiya

        list.add(20);  
        // → list ke end mein 20 add kiya

        list.add(30);  
        // → list ke end mein 30 add kiya

        System.out.println("After add: " + list);  
        // → add karne ke baad list print ki

        // -------- GET OPERATION --------
        int value = list.get(1);  
        // → index 1 par jo element hai usko nikala (20)

        System.out.println("Element at index 1: " + value);  
        // → nikale hue element ko print kiya

        // -------- SET OPERATION --------
        list.set(1, 50);  
        // → index 1 ka element update karke 50 kar diya

        System.out.println("After set: " + list);  
        // → update hone ke baad list print ki

        // -------- CONTAINS OPERATION --------
        boolean found = list.contains(30);  
        // → check kiya ki 30 list mein present hai ya nahi

        System.out.println("List contains 30? " + found);  
        // → true ya false print karega

        // -------- REMOVE OPERATION --------
        list.remove(0);  
        // → index 0 ka element remove kar diya (10)

        System.out.println("After remove: " + list);  
        // → remove hone ke baad list print ki
    }
}

 

// Output:

//After add: [10, 20, 30]
//Element at index 1: 20
//After set: [10, 50, 30]
//List contains 30? true
//After remove: [50, 30]/
