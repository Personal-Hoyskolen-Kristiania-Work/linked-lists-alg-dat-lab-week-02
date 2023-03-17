package src.javaHomemadeDoublyLinkedLists;

public class DoublyInsertions {
    // the Node element previous never get to be a class object with any value in the head node, only an empty variable
    public DoublyNode insertAtHead(DoublyNode list, int intVal) {
        DoublyNode newNode = new DoublyNode(intVal); //method place value in new head node
        newNode.setNext(list); //then previous head node is moved into its next variable reference
        if(list == null){
            return newNode; //if list is null, it's not possible to assign it a previous object reference, so we hand it back before that happen
        }
        list.setPrevious(newNode); //set original head nodes previous variable to new node
        return newNode; //return newNode with changes, by default the value of the nodes previous is set to null in constructor
    }

    // method place node based on previous Node class instance contained
    // int value will pick first matching node value it sees
    // if the int value contained in a node matches the "key" value, then place node after that node
    public DoublyNode insertAfterNodeValue(DoublyNode list, int key, int intVal) {
        DoublyNode newNode = new DoublyNode(intVal); //node with new value we want to add
        // if head data variable match the "key" value, it will place newNode as the next node
        if(key == list.getData()) {
            newNode.setNext(list.getNext()); //set new nodes next node to be the next node after head node
            newNode.setPrevious(list); //set new nodes previous node to list
            list.setNext(newNode); //change newNode to the next node
            return list; //return list with the changes
        }

        DoublyNode temp = list; //temporary variable containing the elements from the current linked list we want to change

        // looping through all elements that do not meet the requirements
        while(temp.getData() != key) {
            System.out.println("loop were in use");
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
            // return the original list if loop reach last element
            if (temp == null) {
                System.out.println("\"key\" value, was not found");
                return list;
            }
        }

        if (temp.getNext() != null) {
            newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
            newNode.getNext().setPrevious(newNode); //set the next nodes previous to be new node
        }
        newNode.setPrevious(temp); //set the previous variable to equal current temp node
        temp.setNext(newNode); //set the next variable to equal the new node, making temp head the head node
        return list; //return list with the changes
    }

    // insert based on position given
    public DoublyNode insertAtPosition(DoublyNode list, int position, int intVal) {
        DoublyNode newNode = new DoublyNode(intVal); //node with new value we want to add
        // change head node if position is 0
        if(position == 0) {
            newNode.setNext(list); //set newNode next variable to be list, effectively making it head
            if(newNode.getNext() == null){
                return newNode; //returning what we got, as we cant assign newNode to be previous node if next don't exist
            }
            newNode.getNext().setPrevious(newNode); //assign newNode to be previous node
            return newNode; //return newNode with the changes, previous is set to null in constructor
        }

        DoublyNode temp = list; //temporary variable containing the elements from the linked list that's getting added to

        // looping through all elements that do not meet the requirements
        for (int i = 0; i < position - 1; i++) {
            // set temp node to equal next temp node while loop is going
            temp = temp.getNext();
            // return the original list/ Node element if loop reach last element
            if (temp == null) {
                System.out.println("\"position\" was not found");
                return list;
            }
        }

        if(temp.getNext() != null) {
            newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
            newNode.getNext().setPrevious(newNode); //set the next nodes previous to be new node
        }
        newNode.setPrevious(temp); //set previous variable to equal current temp node
        temp.setNext(newNode); //set the next variable to equal the new node
        return list; //return list with the changes
    }

    public DoublyNode tailInsertion(DoublyNode list, int intVal) {
        DoublyNode newNode = new DoublyNode(intVal);
        DoublyNode temp = list;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        newNode.setPrevious(temp);
        temp.setNext(newNode);
        return list;
    }
}