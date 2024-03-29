/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.Arrays;

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

      System.out.println("-------------------------------------------");
      System.out.println("Breadth First Traversal"+newGraph.breadthFirst(vertexA));
      System.out.println("Breadth First Traversal"+newGraph.breadthFirst(vertexD));
      System.out.println("Breadth First Traversal"+newGraph.breadthFirst(vertexF));
      System.out.println("-------------------------------------------");

      System.out.println("-------------------------------------------");
      System.out.println("Depth First Traversal"+newGraph.depthFirst(vertexA));
      System.out.println("Depth First Traversal"+newGraph.depthFirst(vertexD));
      System.out.println("Depth First Traversal"+newGraph.depthFirst(vertexF));
      System.out.println("-------------------------------------------");

      String[] arr={"Pandora", "Arendelle", "Metroville", "Monstroplolis", "Narnia", "Naboo"};
      Graph<String> myGraph = new Graph();
      Vertex<String> vertex8=myGraph.addNode("8");
      Vertex<String> vertex1=myGraph.addNode("1");
      Vertex<String> vertex2=myGraph.addNode("2");
      Vertex<String> vertex9=myGraph.addNode("9");
      Vertex<String> vertex7=myGraph.addNode("7");
      Vertex<String> vertex5=myGraph.addNode("5");
      myGraph.addEdge(vertex8 , vertex1 , 50);
      myGraph.addEdge(vertex5 , vertex1, 70);
      myGraph.addEdge(vertex7 , vertex5, 20);
      myGraph.addEdge(vertex8 , vertex9, 100);
      myGraph.addEdge(vertex8 , vertex2, 40);
      myGraph.addEdge(vertex8 , vertex5, 60);
      Vertex<String>[] arr1=new Vertex[]{vertex1,vertex8,vertex9};
      String [] Arr=new String[]{"8","1"};
      System.out.println(myGraph.getNeighbors(vertex1).get(0));
      System.out.println(myGraph.getNeighbors(vertex1));
      System.out.println(Arrays.toString(arr1));
      System.out.println(myGraph.businessTrip(myGraph,arr1));


   }


}
