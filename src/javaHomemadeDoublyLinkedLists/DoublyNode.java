package src.javaHomemadeDoublyLinkedLists;

// singly linked list node structure
public class DoublyNode {
    private int data; //data
    private DoublyNode previous;
    private DoublyNode next; //node class object/ reference to next node

    // constructor call, allow for setting int value of data variable
    DoublyNode(int value) {
        setData(value); //set constructor input to equal data variable
        setNext(null); //set node object/ reference to instance to equal null
        setPrevious(null);
    }

    //region getters
    public int getData() {
        return data;
    }
    public DoublyNode getPrevious(){
        return previous;
    }
    public DoublyNode getNext() {
        return next;
    }
    //endregion

    //region setters
    public void setData(int data) {
        this.data = data;
    }
    public void setPrevious(DoublyNode previous){
        this.previous = previous;
    }
    public void setNext(DoublyNode next) {
        this.next = next;
    }
    //endregion
}
