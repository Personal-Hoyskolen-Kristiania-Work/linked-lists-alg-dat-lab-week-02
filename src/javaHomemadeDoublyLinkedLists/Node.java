package src.javaHomemadeDoublyLinkedLists;

// singly linked list node structure
public class Node {
    private int data; //data
    private Node previous;
    private Node next; //node class object/ reference to next node

    // constructor call, allow for setting int value of data variable
    Node(int value) {
        setData(value); //set constructor input to equal data variable
        setNext(null); //set node object/ reference to instance to equal null
    }

    //region getters
    public int getData() {
        return data;
    }
    public Node getPrevious(){
        return previous;
    }
    public Node getNext() {
        return next;
    }
    //endregion

    //region setters
    public void setData(int data) {
        this.data = data;
    }
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    //endregion
}
