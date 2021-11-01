package trees;

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




}
