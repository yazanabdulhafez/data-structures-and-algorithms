package linked.list;

public class LinkedList<T> {
    Node<T> head;


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

    //this is the method of append
    public void append(T value){
        Node<T> newNode=new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //this is the method of insert before the middle and the start.
    public void insertBefore(T value,T newValue){
        Node<T> newNode=new Node<>(newValue);
        if (head == null) {
            head = newNode;
        } else if (head.value == value) {
            insert(newValue);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;

                }
                current = current.next;
            }
        }
    }

    //this is the method of insert after the middle and the end.
    public void insertAfter(T value,T newValue){
        Node<T> newNode=new Node<>(newValue);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current != null) {
                if (current.value == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;

                }
                current = current.next;
            }
        }
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
