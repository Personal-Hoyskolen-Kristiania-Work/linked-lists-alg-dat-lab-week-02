package src.javaHomemadeSinglyLinkedLists;

public class Insertions {
    // method place value at head node position, then move
    // previous head node into its next variable reference
    public Node insertAtHead(Node list, int intVal){
        Node newNode = new Node(intVal);
        newNode.next = list;
        return newNode;
    }

    // method place node based on previous Node class instance contained
    // int value will pick first matching node value it sees
    // if the int value contained in a node matches the "key" value, then place node after that node
    public Node insertAfterNodeValue(Node list, int key, int intVal) {
        Node newNode = new Node(intVal); //node with new value we want to add
        Node temp = list; //no clue why I need to do extra variable magic, but it works... WHY?
        // change newNode to the next node if head data variable match "key" value
        if(key == temp.data) {
            newNode.next = temp.next;
            temp.next = newNode;
            return temp;
        }

        temp = list; //temporary variable containing the elements from the linked list that's getting added to

        // looping through all elements that do not meet the requirements
        while(temp.data != key) {
            // set temp node to equal next temp node while loop is going
            // effectively decreasing temp linked list by one for each node the loop traverse through
            temp = temp.next;
            // return the original list if loop reach last element
            if (temp == null) {
                System.out.println("\"key\" value, was not found");
                return list;
            }
        }
        newNode.next = temp.next; //set the next variable to equal current temp nodes next
        temp.next = newNode; //set the next variable to equal the new node, making temp head the head node
        list.next = temp; //placing the head back on top again
        return list;
    }
}