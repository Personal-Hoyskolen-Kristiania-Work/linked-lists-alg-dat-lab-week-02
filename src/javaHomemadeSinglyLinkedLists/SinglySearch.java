package src.javaHomemadeSinglyLinkedLists;

public class SinglySearch {
    public SinglyNode search(SinglyNode list, int key) {
        if(list.getData() == key) {
            return list;
        }

        SinglyNode temp = list;
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
