package src.javaHomemadeCircularDoublyLinkedLists;

public class CircularDoublySearch {
    public CircularDoublyNode search(CircularDoublyNode list, int key) {
        if(list.getData() == key) {
            return list;
        }

        CircularDoublyNode temp = list;
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
