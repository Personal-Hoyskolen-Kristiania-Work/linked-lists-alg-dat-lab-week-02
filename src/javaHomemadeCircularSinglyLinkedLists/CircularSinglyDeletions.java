package src.javaHomemadeCircularSinglyLinkedLists;

public class CircularSinglyDeletions {
    public CircularSinglyNode deleteAtHead(CircularSinglyNode list) {
        CircularSinglyNode temp = list;

        while (temp.getNext() != list){
            temp = temp.getNext();
        }
        temp.setNext(list.getNext()); // set last node to link to the node after head

        CircularSinglyNode newNode = list.getNext(); // set new node into the node after head
        return newNode;
    }

    public CircularSinglyNode deleteAtSelectedNode(CircularSinglyNode list, int key) {
        if(key == list.getData()){
            CircularSinglyNode newNode = deleteAtHead(list); // use deleteAtHead method if the target is the first node
            return newNode;
        }

        CircularSinglyNode temp = list; //node for running the loop
        CircularSinglyNode prev = list; //node for doing the correct iteration

        temp = temp.getNext();
        while (temp.getData() != key) {
            temp = temp.getNext();
            prev = prev.getNext();
            if(prev.getNext() == list) {
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
            list = deleteAtHead(newNode); // use deleteAtHead method if the target is the first node
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