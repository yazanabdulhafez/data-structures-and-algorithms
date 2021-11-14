package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree {

    public Node<Integer> root;

    public void add(Integer value) {
        if (root.value == null) {
            root = new Node<>(value);
        } else {
            Node<Integer> focusNode = root;
            Node<Integer> newNode = new Node<>(value);
            while (!value.equals(focusNode.value) &&
                  (focusNode.rightChild != newNode ||
                  focusNode.leftChild != newNode)) { //to ensure that the value not added yet.

                if (value < focusNode.value) {
                    if (focusNode.leftChild == null){   //check if value less than focus add to the left
                        focusNode.leftChild = newNode;
                    }
                    else{
                        focusNode = focusNode.leftChild;
                    }
                } else {                               //c if value greater than focus add to the right
                    if (focusNode.rightChild == null){
                        focusNode.rightChild = newNode;
                    }
                    else{                                //if right is not null make it focus then repeat.
                        focusNode = focusNode.rightChild;
                    }
                }
            }
        }
    }

    public boolean contains(Integer value) {
        if (root == null){      //if root is null return false
            return false;
        }
        if (value.equals(root.value)){   //if root value is the same search value return true
            return true;
        }

        Node<Integer> focusNode = root;  //traverse all the tree until find the value if
                                        // it exists or return false.

        while (focusNode.leftChild != null || focusNode.rightChild != null) {
            if (value < focusNode.value && focusNode.leftChild != null) {
                focusNode = focusNode.leftChild;
            } else if (value > focusNode.value && focusNode.rightChild != null) {
                focusNode = focusNode.rightChild;
            } else{
                return false;
            }
            if (value.equals(focusNode.value)){
                return true;
            }
        }
        return false;
    }

    public int sumOfOddNumbers(BinarySearchTree tree){
        int sum=0;
        List<Node> temp=new ArrayList<>();
        temp.add(tree.root);
        System.out.println(tree.root);
        while(!temp.isEmpty()){
            if ((int)temp.get(0).value%2!=0){
                sum+=(int)temp.get(0).value;
            }
            if (temp.get(0).leftChild!=null){
                temp.add(temp.get(0).leftChild);
            }

            if (temp.get(0).rightChild!=null){
                temp.add(temp.get(0).rightChild);
            }

            temp.remove(0);

        }
        return sum;

    }




}
