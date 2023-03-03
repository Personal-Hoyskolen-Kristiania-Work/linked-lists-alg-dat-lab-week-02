package src.javaHomemadeSinglyLinkedLists;

public class Search {
    public Node search(Node list, int key) {
        if(list.getData() == key) {
            return list;
        }

        Node temp = list;
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
