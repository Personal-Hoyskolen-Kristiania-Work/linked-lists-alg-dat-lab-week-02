package src.javaHomemadeCircularSinglyLinkedLists;

public class CircularPrintCircularSinglyLinkedList {
    public void traversePrintingLL(CircularSinglyLinkedList LL) {
        CircularSinglyNode temp = LL.head;
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
    public void printN(CircularSinglyLinkedList N) {
        // print out current node
        System.out.println(N.head.getData());
    }
}
