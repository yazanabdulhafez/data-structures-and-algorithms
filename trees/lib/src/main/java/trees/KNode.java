package trees;

import java.util.ArrayList;


public class KNode<T> {
    public T value;
    public ArrayList<KNode<T>> children;


    public KNode(T value) {
        this.value = value;
    }

    public KNode() {

    }

    public KNode(T value, ArrayList<KNode<T>> children) {
        this.value = value;
        this.children = children;

    }


}
