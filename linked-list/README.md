# Singly Linked List
<!-- Short summary or background information -->
Singly refers to the number of references the node has. A Singly linked list means that there is only one reference, and the reference points to the Next node in a linked list.

## Challenge
<!-- Description of the challenge -->
Create  Node class to use it inside the linked list class which contain number of methods that can do insert a value to the linked list or check if it contain a certain value and print out the values in the linked list as well.

## Whiteboard Process
<!-- Embedded whiteboard image -->
The append method

![append](img/append.png)

The insertBefore method

![insertBefore](img/insertbefore.png)

The insertAfter method

![insertAfter](img/insertafter.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I use the while() loop. This allows me to continually check that the Next node in the list is not null.

Time : O(n). Space : O(1).

In lab 06 I use the while() loop. and If statments to know the node to be insert before it or after it.
Time : O(n). Space : O(1). for all the functions.

## API
<!-- Description of each method publicly available to your Linked List -->
### Insert

which take a value as Argument and returns nothing,it
adds a new node with that value to the head of the linked list with an O(1) Time performance.

### includes

which take a value as Argument and returns boolean true or false,It indicates whether that value exists as a Node’s value somewhere within the list.

### to string

It returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL".

### append

It takes a new value and adds a new node with the given value to the end of the list.

### insert before

It take a value, new value and adds a new node with the given new value immediately before the first node that has the value specified.

### insert after

It take a value, new value and its adds a new node with the given new value immediately after the first node that has the value specified.

