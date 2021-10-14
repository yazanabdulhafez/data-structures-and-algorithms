package linked.list;

public class LinkedList<T> {
    Node head;


    //this is the constructor.
    public LinkedList() {
        this.head = null;
    }

    //this is a method to insert values into linked list.
    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    //this is a method to check if linked list contain certain value.
    public boolean includes(T value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //this is a method to modify the toString to control the output string.
    public String toString() {
        Node current = head;
        String finalResult = "";
        while (current != null) {
            finalResult += "{" + current.value + "} -> ";
            current = current.next;
        }
        finalResult += "NULL";
        return finalResult;
    }

}
