# Trees
<!-- Short summary or background information -->
A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship.

## Important Terminology in trees

1. Node - A Tree node is a component which may contain it’s own values, and references to other nodes
2. Root - The root is the node at the beginning of the tree
3. K - A number that specifies the maximum number of children any node may have in a k-ary tree. In a binary tree, k = 2.
4. Left - A reference to one child node, in a binary tree
5. Right - A reference to the other child node, in a binary tree
6. Edge - The edge in a tree is the link between a parent and child node
7. Leaf - A leaf is a node that does not have any children
8. Height - The height of a tree is the number of edges from the root to the furthest leaf

## Challenge
<!-- Description of the challenge -->
### Code Challenge 15

Implement the BinaryTrees and BinarySearchTree.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
In add method I used while loop to add the value in its right place.this is good approch to be used.

add():

Time : O(n).

Space : O(n).

In contains method I use a while loop as well to traverse through the tree to find the element.this is agood approch to be used.

contains():

Time : O(n) in the worst case.

Space : O(1).

### Code Challenge 16

Find the maximum value in a given tree.

## Approach & Efficiency (16)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
In add method I used for loop to find the  max value .this is good approch to be used.

add():

Time : O(n).

Space : O(1).

### Code Challenge 17

Write a function called breadth first with Arguments tree and return a list of all values in the tree, in the order they were encountered

## Approach & Efficiency (17)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
In add method I used while loop totraverse through the tree .this is good approch to be used.

add():

Time : O(n).

### Code Challenge 18

Conduct “FizzBuzz” on a k-ary tree while traversing through it to create a new tree.

## Approach & Efficiency (18)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
In add method I used while loop totraverse through the tree and inside it a for loop to loop through children nodes .this is good approch to be used.

add():

Time : O(n).

Space : O(n)

## API
<!-- Description of each method publicly available in each of your trees -->
### Code Challenge (15)

#### Classes and Methods

* `Class:Node`

* `Class:Binary Tree`
* `Methods`
  * pre order
  * in order
  * post order

* `Class:Binary Search Tree`
  * add(Integer value)
  * contains(Integer value)

### Code Challenge (16)

#### Classes and Methods(16)

* `maximumValue()`

## Whiteboard Process
<!-- Embedded whiteboard image -->

![code challenge 16](img/codechallenge16.png)

### Code Challenge (17)

#### Classes and Methods(17)

* `breadthFirst(BinaryTree<Integer> tree)`

## Whiteboard
<!-- Embedded whiteboard image -->

![code challenge 17](img/codechalenge17.png)

### Code Challenge (18)

#### Classes and Methods(18)

* `treeFizzBuzz(K-ary tree)`

## Whiteboard(18)
<!-- Embedded whiteboard image -->

![code challenge 18](img/codechallenge18.png)
