package LinkedList;

import java.util.LinkedList;
// → LinkedList class ko Java library se import kiya

public class BasicLinkedList {
// → Class ka naam

    public static void main(String[] args) {
// → Program execution yahin se start hota hai

        LinkedList<Integer> list = new LinkedList<>();
        // → Integer type ki ek empty LinkedList banayi

        list.add(10);
        // → LinkedList ke end mein 10 add kiya

        list.add(20);
        // → LinkedList ke end mein 20 add kiya

        list.add(30);
        // → LinkedList ke end mein 30 add kiya

        System.out.println(list);
        // → Puri LinkedList print karega
    }
}

