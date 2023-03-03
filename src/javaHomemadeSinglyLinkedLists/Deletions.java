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
            if(temp.getNext() == null) {
                System.out.println("node not found");
                return list;
            }
        }
        // complete bs transactions
        Node newNode = prev.getNext();
        prev.setNext(newNode.getNext());
        return list;
    }
}