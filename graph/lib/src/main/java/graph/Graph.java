package graph;

import java.util.*;

public class Graph <T>{

    public int size;
    public Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
        this.size = 0;
    }

    public Graph(Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList) {
        this.adjacencyList = adjacencyList;
        this.size = 0;
    }

    public Vertex<T> addNode(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        adjacencyList.put(vertex, new ArrayList<>());
        this.size++;
        return vertex;
    }

    public Edge<T> addEdge(Vertex<T> a, Vertex<T> b, int weight) {
        if (adjacencyList.containsKey(a) && adjacencyList.containsKey(b)) {
            Edge<T> aEdge = new Edge<>(weight, b);
            Edge<T> bEdge = new Edge<>(weight, a);
            if(a==b){
                adjacencyList.get(a).add(aEdge);
                return aEdge;
            }else {
                adjacencyList.get(a).add(aEdge);
                adjacencyList.get(b).add(bEdge);
                return aEdge;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public ArrayList<Vertex<T>> getNodes() {
        if (this.adjacencyList.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            ArrayList<Vertex<T>> res = new ArrayList<>();
            this.adjacencyList.forEach((key, value) -> res.add(key));
            return res;
        }
    }

    public ArrayList<Edge<T>> getNeighbors(Vertex<T> vertex) {
        return this.adjacencyList.get(vertex);
    }

    public int size() {
        return this.size;
    }


    public  List<Vertex<T>> breadthFirst( Vertex<T> root) {
        if (root == null) return null;
            List<Vertex<T>> nodes=new ArrayList<>();
            Set<Vertex<T>> visited = new HashSet<>();
            Queue<Vertex<T>> breadth = new Queue<>();
            breadth.enqueue(root);
            visited.add(root);
            while (!breadth.isEmpty()) {
                Vertex<T> front = breadth.dequeue();
                nodes.add(front);
                for (Edge<T> neighbor : getNeighbors(front)) {
                    if (!visited.contains(neighbor.vertex)) {
                        visited.add(neighbor.vertex);
                        breadth.enqueue(neighbor.vertex);
                    }
                }
            }
            return nodes;
    }


    public String businessTrip(Graph<T> graph, Vertex<T>[] cities) {

        int cost = 0;
        boolean isFound = false;

        for (Vertex<T> v : cities) {
            if (!graph.getNodes().contains(v)) {
                return  "false, $0";
            }
        }

        for (int i = 0; i < cities.length - 1; i++) {
            isFound = false;

            for (Edge<T> e : graph.getNeighbors(cities[i])) {

                if (e.vertex.value.equals(cities[i + 1].value)) {
                    cost += e.weight;
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                // return -> boolean, cost
                return "false, $0";
            }
        }

        return isFound + ", $" + cost;
    }


    @Override
    public String toString() {
        if (adjacencyList.isEmpty()) return null;
        return "" + adjacencyList;
    }
}
