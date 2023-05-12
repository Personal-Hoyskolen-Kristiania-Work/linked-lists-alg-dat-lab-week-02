package src.javaHomemadeCircularDoublyLinkedLists;

public class PrintCircularDoublyLinkedList {
    public void traversePrintingDLL(CircularDoublyLinkedList LL) {
        CircularDoublyNode temp = LL.head;
        boolean stopCondition = false;
        while (stopCondition == false) {
            // non ln print, to print out the data in linked lists
            System.out.print(temp.getData() + " -> "); //print out node data, and an arrow for next line
            temp = temp.getNext(); //set current node to next node
            if(temp.getNext() == LL.head.getNext()){
                stopCondition = true;
            }
        }
        System.out.println("last node reached");
    }

    public void reverseTraversePrintingDLL(CircularDoublyLinkedList LL) {
        CircularDoublyNode temp = LL.head;
        boolean stopCondition = false;
        while (stopCondition == false){
            temp = temp.getPrevious();
            System.out.print(temp.getData() + " -> ");
            if(temp.getPrevious() == LL.head.getPrevious()){
                stopCondition = true;
            }
        }
        System.out.println("head node reached");
    }

    public void printN(CircularDoublyLinkedList N) {
        // print out current node
        System.out.println(N.head.getData());
    }
}
