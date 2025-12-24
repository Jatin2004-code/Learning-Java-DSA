package ArrayList;

import java.util.ArrayList;  
// → Java library se ArrayList class import kar rahe hain

public class MaxElement {  
// → Class ka naam MaxElementArrayList rakha hai

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

        list.add(90);  
        // → list me 90 add kiya

        int max = list.get(0);  
        // → pehle element ko maximum maan liya

        for(int i = 1; i < list.size(); i++) {  
        // → loop second element se start kiya

            if(list.get(i) > max) {  
            // → agar current element max se bada hai

                max = list.get(i);  
                // → to max ko update kar diya
            }
        }

        System.out.println("Maximum element: " + max);  
        // → final maximum element print kiya
    }
}

    

//Maximum element: 90
