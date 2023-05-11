package src.javaHomemadeCircularSinglyLinkedLists;

public class CircularSinglyInsertions {
    public CircularSinglyNode insertAtHead(CircularSinglyNode list, int intVal){
        CircularSinglyNode newNode = new CircularSinglyNode(intVal); //method place value at head node position
        newNode.setNext(list); //then previous head node is moved into its next variable reference
        CircularSinglyNode temp = list;
        if(list == null){
            newNode.setNext(newNode); // check to remove the original null head node
            return newNode;
        }

        while (temp.getNext() != list){
            temp = temp.getNext(); // loop through nodes until last node before previous head node
        }
        temp.setNext(newNode); // set the new node as the reference in the last node

        return newNode;
    }

    // method place node based on previous Node class instance contained
    // int value will pick first matching node value it sees
    // if the int value contained in a node matches the "key" value, then place node after that node
    public CircularSinglyNode insertAfterNodeValue(CircularSinglyNode list, int key, int intVal) {
        CircularSinglyNode newNode = new CircularSinglyNode(intVal); //node with new value we want to add
        // change newNode to the next node if head data variable match "key" value
        if(key == list.getData()) {
            newNode.setNext(list.getNext());
            list.setNext(newNode);
            return list; //return list with the changes
        }

        CircularSinglyNode temp = list; //temporary variable containing the elements from the current linked list we want to change

        // looping through all elements that do not meet the requirements
        while(temp.getData() != key) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
            // return the original list/ Node element if loop reach last element
            if (temp == list) {
                System.out.println("\"key\" value, was not found");
                return list;
            }
        }
        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        temp.setNext(newNode); //set the next variable to equal the new node
        return list; //return list with the changes
    }

    // insert based on position given
    public CircularSinglyNode insertAtPosition(CircularSinglyNode list, int position, int intVal) {
        CircularSinglyNode newNode = new CircularSinglyNode(intVal); //node with new value we want to add
        // change head node if position is 0
        if(position == 0) {
            list = insertAtHead(list, intVal); //set newNode next variable to be list, effectively making it head
            return list; //return newNode with the changes
        }

        CircularSinglyNode temp = list; //temporary variable containing the elements from the linked list that's getting added to

        // looping through all elements that do not meet the requirements
        for (int i = 0; i < position - 1; i++) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.getNext();
        }
        newNode.setNext(temp.getNext()); //set the next variable to equal current temp nodes next
        temp.setNext(newNode); //set the next variable to equal the new node
        return list; //return list with the changes
    }

    public CircularSinglyNode tailInsertion(CircularSinglyNode list, int intVal) {
        CircularSinglyNode newNode = new CircularSinglyNode(intVal);
        CircularSinglyNode temp = list;
        while (temp.getNext() != list) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        newNode.setNext(list);
        return list;
    }
}