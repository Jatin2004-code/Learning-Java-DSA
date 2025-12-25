package ArrayList;


import java.util.ArrayList;  
// → Java library se ArrayList class import kar rahe hain

public class MinElement{  
// → Class ka naam MinimumArrayList rakha hai

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

        int min = list.get(0);  
        // → pehle element ko minimum maan liya

        for(int i = 1; i < list.size(); i++) {  
        // → loop second element se start kiya

            if(list.get(i) < min) {  
            // → agar current element min se chhota hai

                min = list.get(i);  
                // → to min ko update kar diya
            }
        }

        System.out.println("Minimum element: " + min);  
        // → final minimum element print kiya
    }
}


//Minimum element: 5



