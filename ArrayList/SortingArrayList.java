package ArrayList;

import java.util.ArrayList;  
// → Java library se ArrayList class import kar rahe hain

import java.util.Collections;  
// → Collections class import kar rahe hain sorting ke liye

public class SortingArrayList {  
// → Class ka naam SortAscendingDescending rakha hai

    public static void main(String[] args) {  
    // → Program execution yahin se start hota hai

        ArrayList<Integer> list = new ArrayList<>();  
        // → Integer type ka ek ArrayList banaya

        list.add(40);  
        // → list me 40 add kiya

        list.add(10);  
        // → list me 10 add kiya

        list.add(25);  
        // → list me 25 add kiya

        list.add(5);  
        // → list me 5 add kiya

        System.out.println("Original ArrayList: " + list);  
        // → original order me list print ki

        // -------- ASCENDING ORDER SORT --------
        Collections.sort(list);  
        // → ArrayList ko chhote se bade order me sort kar diya

        System.out.println("Ascending Order: " + list);  
        // → ascending order me list print ki

        // -------- DESCENDING ORDER SORT --------
        Collections.sort(list, Collections.reverseOrder());  
        // → ArrayList ko bade se chhote order me sort kar diya

        System.out.println("Descending Order: " + list);  
        // → descending order me list print ki
    }
}





// Output:
//Original ArrayList: [40, 10, 25, 5]
//Ascending Order: [5, 10, 25, 40]
//Descending Order: [40, 25, 10, 5]
