package src.javaHomemadeSinglyLinkedLists;

public class SinglyDeletions {
    public SinglyNode deleteAtHead(SinglyNode list) {
        SinglyNode newNode = list;
        list = newNode.getNext();
        return list;
    }

    public SinglyNode deleteAtSelectedNode(SinglyNode list, int key) {
        SinglyNode temp = list; //node for running the loop
        SinglyNode prev = list; //node for doing the correct iteration

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
        SinglyNode newNode = prev.getNext();
        prev.setNext(newNode.getNext());
        return list;
    }

    public SinglyNode deleteAtPosition(SinglyNode list, int position) {
        SinglyNode newNode = list;
        if (position == 0) {
            list = newNode.getNext();
            return list;
        }

        SinglyNode temp = list;

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