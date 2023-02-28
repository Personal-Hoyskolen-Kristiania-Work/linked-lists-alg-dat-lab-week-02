package src.javaLinkedLists;
import java.util.LinkedList;

public class AddToLinkedList {
    // Java program to add elements
    // to a LinkedList
    public LinkedList addToLinkedList(){
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        return ll;
    }
}
