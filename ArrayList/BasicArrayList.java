package ArrayList;

    import java.util.ArrayList;      
// → ArrayList class ko import kar rahe hain Java library se

public class BasicArrayList {    
// → Class ka naam BasicArrayList rakha hai

    public static void main(String[] args) {  
    // → Main method, program execution yahin se start hota hai

        ArrayList<Integer> list = new ArrayList<>();  
        // → Integer type ka ek ArrayList banaya
        // → Isme sirf Integer values store hongi
        // → Abhi list empty hai

        list.add(10);  
        // → 10 ko ArrayList ke andar add kiya

        list.add(20);  
        // → 20 ko list me add kiya

        list.add(30);  
        // → 30 ko list me add kiya

        System.out.println(list);  
        // → Puri ArrayList print karega
        // → Output: [10, 20, 30]

        int firstElement = list.get(0);  
        // → Index 0 par jo value hai usko nikala
        // → Yahan value 10 milegi

        System.out.println("First element: " + firstElement);  
        // → First element ko print kiya

        System.out.println("Size of ArrayList: " + list.size());  
        // → ArrayList me total kitne elements hain, wo batata hai
    }

    
}


//Output:

//[10, 20, 30]
//First element: 10
//Size of ArrayList: 3
