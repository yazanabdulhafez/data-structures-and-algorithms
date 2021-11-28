/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

public class Library {
   public static void main (String[] args){
      Graph<String> newGraph = new Graph<>();
      Vertex<String> vertexA=newGraph.addNode("8");
      Vertex<String> vertexB=newGraph.addNode("2");
      Vertex<String> vertexC=newGraph.addNode("1");
      Vertex<String> vertexD=newGraph.addNode("9");
      Vertex<String> vertexE=newGraph.addNode("7");
      Vertex<String> vertexF= newGraph.addNode("5");
      newGraph.addEdge(vertexA , vertexB,0);
      newGraph.addEdge(vertexA , vertexD,0);
      newGraph.addEdge(vertexA , vertexC,0);
      newGraph.addEdge(vertexE, vertexF,0);
      System.out.println("Graph: "+newGraph);
      System.out.println("Graph Nodes: "+newGraph.getNodes());
      System.out.println("Graph Neighbors: "+newGraph.getNeighbors(vertexA));
      System.out.println("Graph Neighbors: "+newGraph.getNeighbors(vertexE));
      System.out.println("Graph Neighbors: "+newGraph.getNeighbors(vertexF));
      System.out.println("Graph Size: "+newGraph.size());

      System.out.println("Breadth First Traversal"+newGraph.breadthFirst(vertexA));
      System.out.println("Breadth First Traversal"+newGraph.breadthFirst(vertexD));
      System.out.println("Breadth First Traversal"+newGraph.breadthFirst(vertexF));
   }
}
