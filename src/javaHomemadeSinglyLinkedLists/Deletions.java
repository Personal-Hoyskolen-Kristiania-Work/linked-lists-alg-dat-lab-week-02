package src.javaHomemadeSinglyLinkedLists;

public class Deletions {
    public LinkedList deleteAtHead(LinkedList list) {
        Node newNode = list.head;
        list.head = newNode.getNext();
        return list;


    }
    public LinkedList deleteAfterSelectedNode(LinkedList list, int key) {
        Node newNode = list.head;
        Node temp = list.head;

        while (temp.getData() != key) {
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
