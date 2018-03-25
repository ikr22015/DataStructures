package LinkedList.MyPrac;

import java.util.LinkedList;

public class PracA {
    public static void main(String[] args) {
        //Linked list declaration.
        LinkedList<String> list= new LinkedList<String>();

        //add(string element) is using for adding
        //The elements to the linked list.
        list.add("Imran");
        list.add("Jamal");
        list.add("Ehsan");
        list.add("Adnan");
        list.add("Raihan");
        list.add("Sadman");

        //Display the linked list content
        System.out.println("Linked list content: "+list);

        //Add first and last elements.
        list.addFirst("Jasmin");
        list.addLast("Unknown");

        System.out.println("Linked list content after addition: "+list);


        //This is how to get and set value.
        Object firstvar = list.get(0);
        System.out.println("First element: "+firstvar);

        list.set(0, "Shumee");
        Object firstvar2 = list.get(0);
        System.out.println("First Element: "+firstvar2);

        //Remove first and last element
        list.removeFirst();
        list.removeLast();
        System.out.println("Linked list after deletion first and last element: "+list);

        //Add to a position and remove from a position.
        list.add(0,"Jasmin Shumee");
        list.remove(2);
        System.out.println("Final content"+list);
    }
}
