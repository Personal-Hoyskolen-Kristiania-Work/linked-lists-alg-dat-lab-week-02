package src.javaHomemadeCircularSinglyLinkedLists;

public class CircularSinglySearch {
    public CircularSinglyNode search(CircularSinglyNode list, int key) {
        if(list.getData() == key) {
            return list;
        }

        CircularSinglyNode temp = list;
        while (temp.getData() != key) {
            temp = temp.getNext();
            if(temp == list){
                System.out.println("Node not found");
                return null;
            }
        }
        return temp;
    }
}
