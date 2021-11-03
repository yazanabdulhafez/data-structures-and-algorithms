package trees;

import java.util.ArrayList;

public class KaryTree <T>{

    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();
    KNode<T> root;
    public ArrayList<T> preOrder(KNode<T> root) {
        try {
            if (root != null) {
                preOrderList.add(root.value);
                for (int i = 0; i < root.children.size(); i++) {
                    preOrder(root.children.get(i));
                }

            }
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return preOrderList;
    }

    public ArrayList<T> inOrder(KNode<T> root) {
        try {
            if (root != null) {

                inOrderList.add(root.value);
                for (int i = 0; i < root.children.size(); i++) {
                    preOrder(root.children.get(i));
                }
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return inOrderList;
    }

    public ArrayList<T> postOrder(KNode<T> root) {
        try {
            if (root != null) {
                for (int i = 0; i < root.children.size(); i++) {
                    preOrder(root.children.get(i));
                }
                postOrderList.add(root.value);
            }

        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return postOrderList;
    }

    @Override
    public String toString() {
        return "karyTree{" +
                "preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList +
                ", root=" + root +
                '}';
    }
}
