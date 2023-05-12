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

        if(temp == list){
            return deleteAtHead(list);
        }
        // changing node references at selected node in linked list
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        return list;
    }

    public CircularDoublyNode deleteAtPosition(CircularDoublyNode list, int position) {
        CircularDoublyNode temp = list;
        if (position == 0 || list == list.getNext()) {
            return deleteAtHead(list);
        }

        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
            if(temp == list){
                temp = temp.getNext(); // correction for the sake of consistency, as no added element using position can be head after 0 position
            }
        }

        // changing node references at selected node in linked list, effectively referencing itself out of existence
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        return list;
    }
}