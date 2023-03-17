package src.javaHomemadeDoublyLinkedLists;

public class DoublyDeletions {
    public DoublyNode deleteAtHead(DoublyNode list) {
        DoublyNode newNode = list;
        list = newNode.getNext();
        list.setPrevious(null);
        return list;
    }

    public DoublyNode deleteAtSelectedNode(DoublyNode list, int key) {
        DoublyNode temp = list; //node for running the loop

        System.out.println("linked list node data: " + temp.getData() + " key value: " + key);

        while (temp.getData() != key) {
            System.out.println("loop ran");
            temp = temp.getNext();
            if(temp == null) {
                System.out.println("node not found");
                return list;
            }
        }

        refferenceOutOfExistence(temp);
        return list;
    }

    private void refferenceOutOfExistence(DoublyNode temp){
        // changing node references at selected node in linked list
        if(temp.getNext() != null && temp.getPrevious() != null) {
            System.out.println("first option ran");
            temp.getPrevious().setNext(temp.getNext());
            temp.getNext().setPrevious(temp.getPrevious());
        }else if(temp.getPrevious() != null) {
            System.out.println("second option ran");
            temp.getPrevious().setNext(null);
        }else {
            System.out.println("third option ran");
            temp.getNext().setPrevious(null);
        }
    }

    public DoublyNode deleteAtPosition(DoublyNode list, int position) {
        DoublyNode temp = list;
        if (position == 0) {
            list = temp.getNext();
            list.setPrevious(null);
            return list;
        }

        for (int i = 0; i < position; i++) {
            temp = temp.getNext();

            if(temp == null) {
                System.out.println("node not found");
                return list;
            }
        }

        // changing node references at selected node in linked list, effectively referencing itself out of existence
        if(temp.getNext() != null && temp.getPrevious() != null) {
            temp.getPrevious().setNext(temp.getNext());
            temp.getNext().setPrevious(temp.getPrevious());
        }else if(temp.getPrevious() != null) {
            temp.getPrevious().setNext(null);
        }else {
            temp.getNext().setPrevious(null);
        }
        return list;
    }
}