package src.javaHomemadeSinglyLinkedLists;

public class Insertions {
    // method place value at head node position, then move
    // previous head node into its next variable reference
    public Node insertAtHead(Node list, int intVal){
        Node newNode = new Node(intVal);
        newNode.setNext(list);
        return newNode;
    }

    // method place node based on previous Node class instance contained
    // int value will pick first matching node value it sees
    // if the int value contained in a node matches the "key" value, then place node after that node
    public Node insertAfterNodeValue(Node list, int key, int intVal) {
        Node newNode = new Node(intVal); //node with new value we want to add
        // change newNode to the next node if head data variable match "key" value
        if(key == list.getData()) {
            newNode.setNext(list.getNext());
            list.setNext(newNode);
            return list; //return list with the changes
        }

        Node temp = list; //temporary variable containing the elements from the linked list that's getting added to

        // looping through all elements that do not meet the requirements
        while(temp.getData() != key) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
            // return the original list if loop reach last element
            if (temp == null) {
                System.out.println("\"key\" value, was not found");
                return list;
            }
        }
        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        temp.setNext(newNode); //set the next variable to equal the new node, making temp head the head node
        return list; //return list with the changes
    }

    public Node tailInsertion(Node list, int intVal) {
        Node newNode = new Node(intVal);
        Node temp = list;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        return list;
    }
}