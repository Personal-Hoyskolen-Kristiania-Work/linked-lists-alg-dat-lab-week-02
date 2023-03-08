package src.javaHomemadeSinglyLinkedLists;

// singly linked list node structure
public class SinglyNode {
    private int data; //data
    private SinglyNode next; //node class object/ reference to next node

    // constructor call, allow for setting int value of data variable
    SinglyNode(int value) {
        setData(value); //set constructor input to equal data variable
        setNext(null); //set node object/ reference to instance to equal null
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }
}
