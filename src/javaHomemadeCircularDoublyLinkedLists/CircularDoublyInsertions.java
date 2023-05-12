package src.javaHomemadeCircularDoublyLinkedLists;

public class CircularDoublyInsertions {
    // the Node element previous never get to be a class object with any value in the head node, only an empty variable
    public CircularDoublyNode insertAtHead(CircularDoublyNode list, int intVal) {
        CircularDoublyNode newNode = new CircularDoublyNode(intVal); //method place value in new head node
        newNode.setNext(list); //then previous head node is moved into its next variable reference
        if(list == null){
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            return newNode; //if list is null, it's not possible to assign it a previous object reference, so we hand it back before that happen
        }
        newNode.setPrevious(list.getPrevious()); // set original heads previous to new nodes previous
        newNode.getPrevious().setNext(newNode); // set original heads previous, next to new node
        list.setPrevious(newNode); //set original head nodes previous variable to new node
        return newNode; //return newNode with changes, by default the value of the nodes previous is set to null in constructor
    }

    // method place node based on previous Node class instance contained
    // int value will pick first matching node value it sees
    // if the int value contained in a node matches the "key" value, then place node after that node
    public CircularDoublyNode insertAfterNodeValue(CircularDoublyNode list, int key, int intVal) {
        CircularDoublyNode newNode = new CircularDoublyNode(intVal); //node with new value we want to add

        CircularDoublyNode temp = list; //temporary variable containing the elements from the current linked list we want to change

        // looping through all elements that do not meet the requirements
        while(temp.getData() != key) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
            // return the original list if loop reach last element
            if (temp == list) {
                System.out.println("\"key\" value, was not found");
                return list;
            }
        }
        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        newNode.getNext().setPrevious(newNode); //set the next nodes previous to be new node
        newNode.setPrevious(temp); //set the previous variable to equal current temp node
        temp.setNext(newNode); //set the next variable to equal the new node
        return list; //return list with the changes
    }

    // insert based on position given
    public CircularDoublyNode insertAtPosition(CircularDoublyNode list, int position, int intVal) {
        CircularDoublyNode newNode = new CircularDoublyNode(intVal); //node with new value we want to add
        // run insertAtHead method if position is 0
        if(position == 0) {
            list = insertAtHead(list, intVal);
            return list; //return list with changes from insertAtHead method
        }

        CircularDoublyNode temp = list; //temporary variable containing the elements from the linked list that's getting added to

        // looping through all elements that do not meet the requirements
        for (int i = 0; i < position - 1; i++) {
            // set temp node to equal next temp node while loop is going
            temp = temp.getNext();
        }

        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        newNode.getNext().setPrevious(newNode); //set the next nodes previous to be new node
        newNode.setPrevious(temp); //set previous variable to equal current temp node
        temp.setNext(newNode); //set the next variable to equal the new node
        return list; //return list with the changes
    }

    public CircularDoublyNode tailInsertion(CircularDoublyNode list, int intVal) {
        CircularDoublyNode newNode = new CircularDoublyNode(intVal);
        CircularDoublyNode temp = list;
        while (temp.getNext() != list) {
            temp = temp.getNext();
        }

        newNode.setPrevious(temp);
        newNode.setNext(list);
        temp.setNext(newNode);
        list.setPrevious(newNode); // set the head nodes previous to new node
        return list;
    }
}