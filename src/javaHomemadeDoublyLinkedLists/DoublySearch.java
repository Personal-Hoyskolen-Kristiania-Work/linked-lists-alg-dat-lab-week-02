package src.javaHomemadeDoublyLinkedLists;

public class DoublySearch {
    public DoublyNode search(DoublyNode list, int key) {
        if(list.getData() == key) {
            return list;
        }

        DoublyNode temp = list;
        while (temp.getData() != key) {
            temp = temp.getNext();
            if(temp == null){
                System.out.println("Node not found");
                return null;
            }
        }
        return temp;
    }
}
