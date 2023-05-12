package src.javaHomemadeCircularDoublyLinkedLists;

// singly linked list node structure
public class CircularDoublyNode {
    private int data; //data
    private CircularDoublyNode previous;
    private CircularDoublyNode next; //node class object/ reference to next node

    // constructor call, allow for setting int value of data variable
    CircularDoublyNode(int value) {
        setData(value); //set constructor input to equal data variable
        setNext(null); //set node object/ reference to instance to equal null
        setPrevious(null); //set node object/ reference to instance to equal null
    }

    //region getters
    public int getData() {
        return data;
    }
    public CircularDoublyNode getPrevious(){
        return previous;
    }
    public CircularDoublyNode getNext() {
        return next;
    }
    //endregion

    //region setters
    public void setData(int data) {
        this.data = data;
    }
    public void setPrevious(CircularDoublyNode previous){
        this.previous = previous;
    }
    public void setNext(CircularDoublyNode next) {
        this.next = next;
    }
    //endregion
}
