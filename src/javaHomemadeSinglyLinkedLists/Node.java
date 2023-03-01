package src.javaHomemadeSinglyLinkedLists;
// NB this node class contain attributes that are open for direct access, as they seem to follow the class access modifier

// singly linked list node structure
public class Node {
    int data; //data
    Node next; //node class object/ reference to next node

    // constructor call, allow for setting int value of data variable
    Node(int value) {
        data = value; //set constructor input to equal data variable
        next = null; //set node object/ reference to instance to equal null
    }
}
