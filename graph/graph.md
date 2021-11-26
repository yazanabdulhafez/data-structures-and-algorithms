# Graphs
<!-- Short summary or background information -->
A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.

common terminology used when working with Graphs:

1. Vertex: is a data object that can have zero or more adjacent vertices.
2. Edge: its a connection between two nodes.
3. Neighbor: it is the adjacent nodes, i.e., are connected via an edge.
4. Degree: it is the number of edges connected to that vertex.

## Challenge
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1. add node.
2. add edge
3. get nodes
4. get neighbors
5. size

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Approach:Create a test driven Graph Class which follows best practices and has optimized time and space.

Efficiency:

* `addNode(T value)`
  * `Time` : O(1), no loops.
  * `Space` : O(n), create new vertex .

* `addEdge(Vertex<T> a, Vertex<T> b, int weight)`
  * `Time` : O(1), no loops.
  * `Space` : O(n),create new edge .

* `getNodes()`
  * `Time` : O(1), no loops.
  * `Space` : O(1), no extra spaces.

* `getNeighbors(Vertex<T> vertex)`
  * `Time` : O(1), no loops.
  * `Space` : O(1), no extra spaces.

* `size()`
  * `Time` : O(1), no loops.
  * `Space` : O(1), no extra spaces.

## API
<!-- Description of each method publicly available in your Graph -->

* add node
  * Arguments: value
  * Returns: The added node
  * Add a node to the graph

* add edge
  * Arguments: 2 nodes to be connected by the edge, weight (optional)
  * Returns: nothing
  * Adds a new edge between two nodes in the graph
  * If specified, assign a weight to the edge
  * Both nodes should already be in the Graph

* get nodes
  * Arguments: none
  * Returns all of the nodes in the graph as a collection (set, list, or similar)

* get neighbors
  * Arguments: node
  * Returns a collection of edges connected to the given node
  * Include the weight of the connection in the returned collection

## Solution
<!-- Show how to run your code, and examples of it in action -->
## [Line to the code==>](/graph/lib/src/main/java/graph/Graph.java)

## [Line to the Test==>](/graph/lib/src/test/java/graph/LibraryTest.java)

Clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the library by ./gradlew run,and run the test by ./gradlew test.
