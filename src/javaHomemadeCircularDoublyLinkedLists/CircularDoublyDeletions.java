package src.javaHomemadeCircularDoublyLinkedLists;

public class CircularDoublyDeletions {
    public CircularDoublyNode deleteAtHead(CircularDoublyNode list) {
        CircularDoublyNode newNode = list.getNext();
        if (newNode == list) {
            return null;
        }
        newNode.setPrevious(list.getPrevious());
        newNode.getPrevious().setNext(newNode);
        return newNode;
    }

    // these next two do not work if there's only 1 node left
    public CircularDoublyNode deleteAtSelectedNode(CircularDoublyNode list, int key) {
        CircularDoublyNode temp = list; //node for running the loop
        while (temp.getData() != key) {
            temp = temp.getNext();
            if(temp == list) {
                System.out.println("node not found");
                return list;
            }
        }

        // changing node references at selected node in linked list
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        return list;
    }

    public CircularDoublyNode deleteAtPosition(CircularDoublyNode list, int position) {
        CircularDoublyNode temp = list;
        if (position == 0) {
            return deleteAtHead(list);
        }

        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }

        // changing node references at selected node in linked list, effectively referencing itself out of existence
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        if(temp == list){
            return temp.getNext();
        }
        return list;
    }
}