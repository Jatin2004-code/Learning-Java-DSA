package ArrayList;

import java.util.ArrayList;  
// → Java library se ArrayList class import kar rahe hain

public class Swapnum {  
// → Class ka naam SwapArrayList rakha hai

    public static void main(String[] args) {  
    // → Program execution yahin se start hota hai

        ArrayList<Integer> list = new ArrayList<>();  
        // → Integer type ka ek ArrayList banaya

        list.add(10);  
        // → list me 10 add kiya

        list.add(20);  
        // → list me 20 add kiya

        list.add(30);  
        // → list me 30 add kiya

        list.add(40);  
        // → list me 40 add kiya

        System.out.println("Before swap: " + list);  
        // → swap se pehle list print ki

        int index1 = 1;  
        // → pehla index jise swap karna hai (20)

        int index2 = 3;  
        // → doosra index jise swap karna hai (40)

        int temp = list.get(index1);  
        // → index1 ki value temporary variable me store ki

        list.set(index1, list.get(index2));  
        // → index2 ki value index1 par daal di

        list.set(index2, temp);  
        // → temp me stored value index2 par daal di

        System.out.println("After swap: " + list);  
        // → swap ke baad list print ki
    }
}




// Output:
//Before swap: [10, 20, 30, 40]
//After swap: [10, 40, 30, 20]
