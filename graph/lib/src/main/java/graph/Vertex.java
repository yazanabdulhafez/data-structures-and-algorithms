package graph;

public class Vertex <T>{

    public T value;

    public Vertex(){

    }

    public Vertex(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + value +
                '}';
    }
}
