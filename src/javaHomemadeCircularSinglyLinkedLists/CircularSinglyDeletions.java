package src.javaHomemadeCircularSinglyLinkedLists;

public class CircularSinglyDeletions {
    public CircularSinglyNode deleteAtHead(CircularSinglyNode list) {
        CircularSinglyNode temp = list;

        while (temp.getNext() != list){
            temp = temp.getNext();
        }
        temp.setNext(list.getNext());

        CircularSinglyNode newNode = list.getNext();
        return newNode;
    }

    public CircularSinglyNode deleteAtSelectedNode(CircularSinglyNode list, int key) {
        CircularSinglyNode temp = list; //node for running the loop
        CircularSinglyNode prev = list; //node for doing the correct iteration

        temp = temp.getNext();
        while (temp.getData() != key) {
            temp = temp.getNext();
            prev = prev.getNext();
            if(prev.getNext() == null) {
                System.out.println("node not found");
                return list;
            }
        }
        // changing node references at selected node in linked list
        CircularSinglyNode newNode = prev.getNext();
        prev.setNext(newNode.getNext());
        return list;
    }

    public CircularSinglyNode deleteAtPosition(CircularSinglyNode list, int position) {
        CircularSinglyNode newNode = list;
        if (position == 0) {
            list = newNode.getNext();
            return list;
        }

        CircularSinglyNode temp = list;

        for (int i = 0; i < position-1; i++) {
            temp = temp.getNext();

            if(temp.getNext() == null) {
                System.out.println("node not found");
                return list;
            }
        }

        newNode = temp.getNext();
        temp.setNext(newNode.getNext());
        return list;
    }
}