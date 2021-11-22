# Hash Tables

## Hash tables OverView
<!-- Short summary or background information -->

Hatch table is a data structure it is basically an array of a list. Each list is known as a bucket A Hash table contains values based on the key.

### Terminology

1. Hash - A hash is the result of some algorithm taking an incoming string and converting it into a value that could be used for either security or some other purpose. In the case of a hash table, it is used to determine the index of the array.
2. Buckets - A bucket is what is contained in each index of the array of the hash table. Each index is a bucket. An index could potentially contain multiple key/value pairs if a collision occurs.
3. Collisions - A collision is what happens when more than one key gets hashed to the same location of the hash table.

### Why do we use them?

1. Hold unique values
2. Dictionary
3. Library

## Challenge
<!-- Description of the challenge -->

### CodeChallenge #30

Implement the hash table

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

CodeChallenge(30)Approach:

Create the Bucket class which is the building block for the hash table then create hash table class which contain the hash table methods.

The time and space complexity is:

* `hash(K key)`
  * T: O(1)
  * S: O(1)
* `add(K key, V value)`
  * T: O(n)
  * S: O(n)
* `get(K key)`
  * T: O(1)
  * S: O(1)
* `contains(K key)`
  * T: O(1)
  * S: O(1)

## API
<!-- Description of each method publicly available in each of your hashtable -->
### codeChallenge(30)

#### add

Arguments: key, value

Returns: nothing

This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

#### get

Arguments: key

Returns: Value associated with that key in the table

#### contains

Arguments: key
Returns: Boolean, indicating if the key exists in the table already.

### hash

Arguments: key

Returns: Index in the collection for that key

Arguments: string

Return: string

## Solution

[Link to the HashTable code](/hashTable/lib/src/main/java/hashTable/HashTable.java)

## repeated word

### Challenge Summary
<!-- Description of the challenge -->
Write a function called repeated word that finds the first word to occur more than once in a string.

### Whiteboard Process
<!-- Embedded whiteboard image -->

![CodeChallenge 31](/hashTable/img/codechallenge31.png)

### Approach & Efficiency for code challenge(31)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Approach:

* Create a method which takes in a long string, break the string apart on every space into a String[]
* Instantiate an empty HashTable
* Iterate over the String[] - strip the non-letter characters from the words in the array.
* Conditional check if the hash table has the current word inside it:
if yes, return that word as the answer
if no, add the word to the hash table

* `Time and Space:`
* `repeatedWord(String inputStr)`
  * T: O(n)
  * S: O(n)

### Solution for code challenge(31)
<!-- Show how to run your code, and examples of it in action -->
[Link to the repeated word code](/hashTable/lib/src/main/java/hashTable/Library.java)

[Link to the Test](/hashTable/lib/src/test/java/hashTable/LibraryTest.java)

Clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the library by ./gradlew run,and run the test by ./gradlew test.
