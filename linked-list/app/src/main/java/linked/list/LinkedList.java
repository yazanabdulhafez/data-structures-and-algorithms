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
    public void append(T value) {
        Node<T> newNode = new Node<>(value);
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
    public void insertBefore(T value, T newValue) {
        Node<T> newNode = new Node<>(newValue);
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
    public void insertAfter(T value, T newValue) {
        Node<T> newNode = new Node<>(newValue);
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
    //this is delete method for a certain node.

    public void delete(T value) {
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                Node<T> testNode = current.next;
                current.next = testNode.next;
                break;
            }
            current = current.next;
        }
    }

    //this is a method to return value in provided index.
    public String kthFromEnd(int k) {
        if (head == null) {
            return "Exception";
        }
        Node<T> current = head;
        int counter = 0;
        while (current.next != null) {
            current = current.next;
            counter++;
        }

        if (k > counter || k < 0) {
            return "Exception";
        } else {
            current = head;
            for (int i = 0; i <= counter - k; i++) {
                if (i == counter - k) {
                    return "{" + current.value + "}";
                }
                current = current.next;
            }
        }
        return "Exception";
    }

    //this method to reverse a linked list
    public LinkedList<T> reverseLinkedList(LinkedList<T> normalList) {
        if (normalList.head == null) {
            return normalList;
        }
//head->[3]->[2]->[1] //head->[1]->[2]->[3]
        Node<T> current = normalList.head;//3
        Node<T> newCurrent = current.next;//2
        Node<T> newNextCurrent = normalList.head;//3
        while (newCurrent != null) {
            current.next = newCurrent.next;//1  //3
            newCurrent.next = newNextCurrent;//3 //2
            newNextCurrent = newCurrent;//2  //2
            newCurrent = current.next;//2
        }
        normalList.head = newNextCurrent;
        return normalList;
    }


    public String zipLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        System.out.println(list1);
        Node firstCurrent = list1.head;
        Node secondCurrent = list2.head;
        if (list1.head == null && list2.head == null) {
            return null;
        }
        if (list1.head == null) {
            return list2.toString();
        }

        if (list2.head == null) {
            return list1.toString();
        }

        LinkedList<Object> zippedList = new LinkedList<>();

        while (firstCurrent != null || secondCurrent != null) {
            if (firstCurrent != null) {
                zippedList.append(firstCurrent.value);
                firstCurrent = firstCurrent.next;
            }
            if (secondCurrent != null) {
                zippedList.append(secondCurrent.value);
                secondCurrent = secondCurrent.next;
            }
        }
        return zippedList.toString();
    }

    ;


    //this is a method to modify the toString to control the output string.
    public String toString() {
        Node<T> current = head;
        String finalResult = "";
        while (current != null) {
            finalResult += "{" + current.value + "} -> ";
            current = current.next;
        }
        finalResult += "NULL";
        return finalResult;
    }

}
