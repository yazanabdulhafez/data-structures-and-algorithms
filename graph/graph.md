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

## Challenge Summary(36)
<!-- Description of the challenge -->
Implement a breadth-first traversal on a graph.

* Feature Tasks
  * `Write the following method for the Graph class:`
    * `breadth first`
    * `Arguments: Node`
    * `Return: A collection of nodes in the order they were visited.`
    * `Display the collection`

## Whiteboard Process(36)
<!-- Embedded whiteboard image -->
![code challenge 36](/graph/img/codechallenge36.png)

## Approach & Efficiency(36)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

time : O(n^2) - nested loop

scape : O(n) - create new list and Set.

## Solution(36)
<!-- Show how to run your code, and examples of it in action -->

[Line to the code==>](/graph/lib/src/main/java/graph/Graph.java)

[Line to the Test==>](/graph/lib/src/test/java/graph/LibraryTest.java)

Clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the library by ./gradlew run,and run the test by ./gradlew test.

## business trip

### Challenge(37)

Write a function called business trip
Determine whether the trip is possible with direct flights, and how much it would cost.

* input -> graph, array of city names.

* output -> cost or null.

## Whiteboard (37)

![business trip](./img/codechallenge37.png)

## Approach & Efficiency(37)

Use a nested loop to check if each city has direct edge with the next city and add the weight of this edge to the cost.

* time : O(n^2) - nested loops.

* scape : O(1) - no extra spaces.

## Solution(37)
<!-- Show how to run your code, and examples of it in action -->

[Line to the code==>](/graph/lib/src/main/java/graph/Graph.java)

[Line to the Test==>](/graph/lib/src/test/java/graph/LibraryTest.java)

Clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the library by ./gradlew run,and run the test by ./gradlew test.

## Depth First

### Challenge(38)

Write the following method for the Graph class:

* Name: Depth first
* Arguments: Node (Starting point of search)
* Return: A collection of nodes in their pre-order depth-first traversal order
* Program output: Display the collection

## Whiteboard (38)

![depthFirst](/graph/img/CC38.png)

## Approach & Efficiency(38)

we use nested loop to check if the top node has unvisited children to  add them to stack if not pop it from stack.

-Time complexity: O(n^2) - nested loop
-space complexity:O(n) - create new list and Set.

## Solution(38)
<!-- Show how to run your code, and examples of it in action -->

[Line to the code==>](/graph/lib/src/main/java/graph/Graph.java)

[Line to the Test==>](/graph/lib/src/test/java/graph/LibraryTest.java)

Clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the library by ./gradlew run,and run the test by ./gradlew test.
