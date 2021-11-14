package trees;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {

    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();
    Node<T> root;
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
            return (Integer)root.value;
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


        public boolean leafSimilar(Node root1, Node root2) {
            List<Integer> leaves1 = new ArrayList();
            List<Integer> leaves2 = new ArrayList();
            System.out.println(root1);
            System.out.println(root2);
            travers(root1, leaves1);
            travers(root2, leaves2);
            System.out.println(leaves1);
            System.out.println(leaves2);
            return leaves1.size()==leaves2.size();
        }

        public void travers(Node node, List leafValues) {
            if (node != null) {
                if (node.leftChild == null && node.rightChild == null)
                    leafValues.add(node.value);
                travers(node.leftChild, leafValues);
               travers(node.rightChild, leafValues);
            }
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
