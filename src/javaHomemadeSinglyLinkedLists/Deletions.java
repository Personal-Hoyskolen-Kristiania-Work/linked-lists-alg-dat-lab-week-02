package src.javaHomemadeSinglyLinkedLists;

public class Deletions {
    public LinkedList deleteAtSelectedNode(LinkedList list, int key) {
        Node newNode = list.head;
        if(list.head.getData() == key){
            list.head = newNode.getNext();
            return list;
        }

        Node temp = list.head;
        Node prev = list.head;

        while (newNode.getData() != key) {
            newNode = newNode.getNext();
            prev = temp;
            if(prev == null) {
                System.out.println("node not found");
                return list;
            }
        }

        prev.setNext(temp.getNext());
        list.head = prev;
        return list;
    }
}
