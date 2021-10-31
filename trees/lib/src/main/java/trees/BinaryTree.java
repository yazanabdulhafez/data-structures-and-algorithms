package trees;

import java.util.ArrayList;

public class BinaryTree<T> {

    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();
    Node<Integer> root;
    public ArrayList<T> preOrder(Node<T> root) {
        try {
            if (root != null) {
                preOrderList.add(root.value);
                preOrder(root.leftChild);
                preOrder(root.rightChild);
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return preOrderList;
    }

    public ArrayList<T> inOrder(Node<T> root) {
        try {
            if (root != null) {
                inOrder(root.leftChild);
                inOrderList.add(root.value);
                inOrder(root.rightChild);
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return inOrderList;
    }

    public ArrayList<T> postOrder(Node<T> root) {
        try {
            if (root != null) {
                postOrder(root.leftChild);
                postOrder(root.rightChild);
                postOrderList.add(root.value);
            }

        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return postOrderList;
    }

    public int maximumValue() {
        if (root == null){
            return 0;
        }
        if (root.leftChild == null || root.rightChild == null){
            return root.value;
        }
        int maxValue = 0;
        ArrayList<Integer> maxList = (ArrayList<Integer>) postOrder((Node<T>) root);
        for (Integer integer : maxList) {
            if (integer >= maxValue) {
                maxValue = integer;
            }
        }
        return maxValue;
    }


    @Override
    public String toString() {
        if (preOrderList.isEmpty()&&inOrderList.isEmpty()&&postOrderList.isEmpty()) return "empty tree lists";
        else return "BinaryTree{" +
                ", preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList +
                '}';
    }
}
