package src.javaHomemadeCircularSinglyLinkedLists;

// singly linked list node structure
public class CircularSinglyNode {
    private int data; //data
    private CircularSinglyNode next; //node class object/ reference to next node

    // constructor call, allow for setting int value of data variable
    CircularSinglyNode(int value) {
        setData(value); //set constructor input to equal data variable
        setNext(null); //set node object/ reference to instance to equal null
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularSinglyNode getNext() {
        return next;
    }

    public void setNext(CircularSinglyNode next) {
        this.next = next;
    }
}
