package trees;

public class Node <T>{
    public T value;
    public Node<T> leftChild;
    public Node<T> rightChild;


    //leaf node
    public Node(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild =null;
    }

    //normal node has leftChild and rightChild
    public Node(T value, Node<T> leftChild, Node<T> rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


}
