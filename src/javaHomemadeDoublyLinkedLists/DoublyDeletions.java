package src.javaHomemadeDoublyLinkedLists;

public class DoublyDeletions {
    public DoublyNode deleteAtHead(DoublyNode list) {
        DoublyNode newNode = list;
        list = newNode.getNext();
        list.setPrevious(null);
        return list;
    }

    public DoublyNode deleteAtSelectedNode(DoublyNode list, int key) {
        DoublyNode temp = list; //node for running the loop
        while (temp.getData() != key) {
            temp = temp.getNext();
            if(temp == null) {
                System.out.println("node not found");
                return list;
            }
        }

        // changing node references at selected node in linked list
        DoublyNode prev = temp.getPrevious();
        prev.setNext(temp.getNext());
        return list;
    }

    public DoublyNode deleteAtPosition(DoublyNode list, int position) {
        DoublyNode newNode = list;
        if (position == 0) {
            list = newNode.getNext();
            list.setPrevious(null);
            return list;
        }

        for (int i = 0; i < position; i++) {
            newNode = newNode.getNext();

            if(newNode.getNext() == null) {
                System.out.println("node not found");
                return list;
            }
        }

        // changing node references at selected node in linked list, effectively referencing itself out of existence
        newNode.getNext().setPrevious(newNode.getPrevious()); //set next nodes previous node to equal node before newNode node
        newNode.getPrevious().setNext(newNode.getNext()); //set previous nodes next node to equal newNodes next node
        return list;
    }
}