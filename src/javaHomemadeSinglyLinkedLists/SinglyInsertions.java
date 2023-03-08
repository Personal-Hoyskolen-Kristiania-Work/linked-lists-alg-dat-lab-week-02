package src.javaHomemadeSinglyLinkedLists;

public class SinglyInsertions {
    public SinglyNode insertAtHead(SinglyNode list, int intVal){
        SinglyNode newNode = new SinglyNode(intVal); //method place value at head node position
        newNode.setNext(list); //then previous head node is moved into its next variable reference
        return newNode;
    }

    // method place node based on previous Node class instance contained
    // int value will pick first matching node value it sees
    // if the int value contained in a node matches the "key" value, then place node after that node
    public SinglyNode insertAfterNodeValue(SinglyNode list, int key, int intVal) {
        SinglyNode newNode = new SinglyNode(intVal); //node with new value we want to add
        // change newNode to the next node if head data variable match "key" value
        if(key == list.getData()) {
            newNode.setNext(list.getNext());
            list.setNext(newNode);
            return list; //return list with the changes
        }

        SinglyNode temp = list; //temporary variable containing the elements from the current linked list we want to change

        // looping through all elements that do not meet the requirements
        while(temp.getData() != key) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
            // return the original list/ Node element if loop reach last element
            if (temp == null) {
                System.out.println("\"key\" value, was not found");
                return list;
            }
        }
        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        temp.setNext(newNode); //set the next variable to equal the new node, making temp head the head node
        return list; //return list with the changes
    }

    // insert based on position given
    public SinglyNode insertAtPosition(SinglyNode list, int position, int intVal) {
        SinglyNode newNode = new SinglyNode(intVal); //node with new value we want to add
        // change head node if position is 0
        if(position == 0) {
            newNode.setNext(list); //set newNode next variable to be list, effectively making it head
            return newNode; //return newNode with the changes
        }

        SinglyNode temp = list; //temporary variable containing the elements from the linked list that's getting added to

        // looping through all elements that do not meet the requirements
        for (int i = 0; i < position - 1; i++) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
            // return the original list if loop reach last element
            if (temp == null) {
                System.out.println("\"position\" was not found");
                return list;
            }
        }
        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        temp.setNext(newNode); //set the next variable to equal the new node
        return list; //return list with the changes
    }

    public SinglyNode tailInsertion(SinglyNode list, int intVal) {
        SinglyNode newNode = new SinglyNode(intVal);
        SinglyNode temp = list;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        return list;
    }
}