package src.javaHomemadeSinglyLinkedLists;

public class Deletions {
    public Node deleteAtHead(Node list) {
        Node newNode = list;
        list = newNode.getNext();
        return list;
    }

    public Node deleteAtSelectedNode(Node list, int key) {
        Node temp = list; //node for running the loop
        Node prev = list; //node for doing the correct iteration

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
        Node newNode = prev.getNext();
        prev.setNext(newNode.getNext());
        return list;
    }

    public Node deleteAtPosition(Node list, int position) {
        Node newNode = list;
        if (position == 0) {
            list = newNode.getNext();
            return list;
        }

        Node temp = list;

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