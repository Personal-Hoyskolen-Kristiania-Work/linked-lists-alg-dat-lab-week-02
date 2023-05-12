package src.javaHomemadeCircularDoublyLinkedLists;

public class CircularDoublyDeletions {
    public CircularDoublyNode deleteAtHead(CircularDoublyNode list) {
        CircularDoublyNode newNode = list;
        list = newNode.getNext();
        list.setPrevious(null);
        return list;
    }

    public CircularDoublyNode deleteAtSelectedNode(CircularDoublyNode list, int key) {
        CircularDoublyNode temp = list; //node for running the loop

        while (temp.getData() != key) {
            temp = temp.getNext();
            if(temp == null) {
                System.out.println("node not found");
                return list;
            }
        }

        // changing node references at selected node in linked list
        if(temp.getNext() != null && temp.getPrevious() != null) {
            temp.getPrevious().setNext(temp.getNext());
            temp.getNext().setPrevious(temp.getPrevious());
        }else if(temp.getPrevious() != null) {
            temp.getPrevious().setNext(null);
        }else if(temp.getNext() != null){
            list = temp.getNext();
            temp.getNext().setPrevious(null);
        }

        return list;
    }

    public CircularDoublyNode deleteAtPosition(CircularDoublyNode list, int position) {
        CircularDoublyNode temp = list;
        if (position == 0) {
            list = temp.getNext();
            list.setPrevious(null);
            return list;
        }

        for (int i = 0; i < position; i++) {
            temp = temp.getNext();

            if(temp == null) {
                System.out.println("node not found");
                return list;
            }
        }

        // changing node references at selected node in linked list, effectively referencing itself out of existence
        if(temp.getNext() != null && temp.getPrevious() != null) {
            temp.getPrevious().setNext(temp.getNext());
            temp.getNext().setPrevious(temp.getPrevious());
        }else if(temp.getPrevious() != null) {
            temp.getPrevious().setNext(null);
        }else {
            temp.getNext().setPrevious(null);
        }
        return list;
    }
}