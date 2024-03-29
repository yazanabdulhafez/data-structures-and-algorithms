/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void hashTableTest() {
        // Adding a key/value to your hashtable results in the value being in the data structure
        HashTable testTable = new HashTable<>();
        testTable.add("testValue", 10);
        assertEquals(10, testTable.get("testValue"));
        assertEquals("HashTable{hashTable=[null, null, null, null, null, null, Bucket{key=testValue, value=10}, null, null, null, null, null, null, null, null]}", testTable.toString());

        // Retrieving based on a key returns the value stored
        assertEquals(10, testTable.get("testValue"));

        // Successfully returns null for a key that does not exist in the hashtable
        assertNull(testTable.get("null"));

        // Successfully handle a collision within the hashtable
        testTable.add("zzG", "certain Value");
        testTable.add("sec", "second Value");
        System.out.println(testTable);
        assertEquals("HashTable{hashTable=[Bucket{key=sec, value=second Value}, null, null, null, null, null, Bucket{key=testValue, value=10}, null, null, null, null, null, null, null, null]}", testTable.toString());

        // Successfully retrieve a value from a bucket within the hashtable that has a collision
        assertEquals("second Value", testTable.get("sec"));

        // Successfully hash a key to an in-range value
        assertEquals(0, testTable.hash("zzG"));
        assertEquals(0, testTable.hash("sec"));
    }

    @Test
    public void repeatedWord() {
        //Test for un repeated word string
        String testStr = "If you want something done right, do it yourself";
        assertEquals("NoRepetition", Library.repeatedWord(testStr));

        //Test for word "a"
        String inputSt = "Once upon a time, there was a brave princess who...";
        assertEquals("a", Library.repeatedWord(inputSt));

        //Test for word "it"
        String inputStr = "It was the best of times," +
                " it was the worst of times," +
                " it was the age of wisdom," +
                " it was the age of foolishness," +
                " it was the epoch of belief," +
                " it was the epoch of incredulity," +
                " it was the season of Light," +
                " it was the season of Darkness," +
                " it was the spring of hope," +
                " it was the winter of despair," +
                " we had everything before us," +
                " we had nothing before us, " +
                "we were all going direct to Heaven," +
                " we were all going direct the other way – in short," +
                " the period was so far like the present period," +
                " that some of its noisiest authorities insisted on its being received," +
                " for good or for evil, in the superlative degree of comparison only...";
        assertEquals("it", Library.repeatedWord(inputStr));

        //Test for word "summer"
        String inputString = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs," +
                " and I didn’t know what I was doing in New York...";
        assertEquals("summer", Library.repeatedWord(inputString));
    }

    @Test
    void testTreeIntersection() {

        BinaryTree<Integer> tree1 = new BinaryTree<>();
        BinaryTree<Integer> tree2 = new BinaryTree<>();

        // if both of the trees are empty
        assertNull(Library.treeIntersection(tree1, tree2));

        // if one of the trees is empty
        tree1.root = new Node<>(5);
        assertNull(Library.treeIntersection(tree1, tree2));

        // if there is no common values in both trees
        tree1 = new BinaryTree<>();
        tree2 = new BinaryTree<>();
        Node<Integer> item6 = new Node<>(30);
        Node<Integer> item5 = new Node<>(27);
        Node<Integer> item4 = new Node<>(2);
        Node<Integer> item3 = new Node<>(11, item6, null);
        Node<Integer> item2 = new Node<>(15, item5, null);
        Node<Integer> item1 = new Node<>(3, item3, item4);
        Node<Integer> root1 = new Node<>(20, item1, item2);
        tree1.root = root1;

        Node<Integer> item12 = new Node<>(31);
        Node<Integer> item11 = new Node<>(29);
        Node<Integer> item10 = new Node<>(1);
        Node<Integer> item9 = new Node<>(10, item12, null);
        Node<Integer> item8 = new Node<>(16, item11, null);
        Node<Integer> item7 = new Node<>(4, item9, item10);
        Node<Integer> root2 = new Node<>(19, item7, item8);
        tree2.root = root2;

        ArrayList<Integer> test = Library.treeIntersection(tree1, tree2);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, test);


        // test for one common value
        tree1 = new BinaryTree<>();
        tree2 = new BinaryTree<>();
        Node<Integer> item16 = new Node<>(30);
        Node<Integer> item15 = new Node<>(27);
        Node<Integer> item14 = new Node<>(2);
        Node<Integer> item13 = new Node<>(11, item16, null);
        Node<Integer> item121 = new Node<>(15, item15, null);
        Node<Integer> item111 = new Node<>(3, item13, item14);
        Node<Integer> root11 = new Node<>(20, item111, item121);
        tree1.root = root11;

        Node<Integer> item22 = new Node<>(31);
        Node<Integer> item21 = new Node<>(30);
        Node<Integer> item20 = new Node<>(1);
        Node<Integer> item29 = new Node<>(10, item22, null);
        Node<Integer> item28 = new Node<>(16, item21, null);
        Node<Integer> item27 = new Node<>(4, item29, item20);
        Node<Integer> root22 = new Node<>(19, item27, item28);
        tree2.root = root22;

        ArrayList<Integer> test1 = Library.treeIntersection(tree1, tree2);
        ArrayList<Integer> expected1 = new ArrayList<>();
        expected1.add(30);
        assertEquals(expected1, test1);


        //test for multiple intersection values
        tree1 = new BinaryTree<>();
        tree2 = new BinaryTree<>();
        Node<Integer> item36 = new Node<>(30);
        Node<Integer> item35 = new Node<>(27);
        Node<Integer> item34 = new Node<>(1);
        Node<Integer> item33 = new Node<>(11, item36, null);
        Node<Integer> item32 = new Node<>(16, item35, null);
        Node<Integer> item31 = new Node<>(3, item33, item34);
        Node<Integer> root31 = new Node<>(20, item31, item32);
        tree1.root = root31;

        Node<Integer> item42 = new Node<>(31);
        Node<Integer> item41 = new Node<>(30);
        Node<Integer> item40 = new Node<>(1);
        Node<Integer> item49 = new Node<>(10, item42, null);
        Node<Integer> item48 = new Node<>(16, item41, null);
        Node<Integer> item47 = new Node<>(4, item49, item40);
        Node<Integer> root42 = new Node<>(19, item47, item48);
        tree2.root = root42;

        ArrayList<Integer> test2 = Library.treeIntersection(tree1, tree2);
        ArrayList<Integer> expected2 = new ArrayList<>();
        expected2.add(30);
        expected2.add(1);
        expected2.add(16);
        assertEquals(expected2, test2);

    }

    @Test
    public void LeftJoinTest() {

        //test when both hash maps are empty
        HashMap<String, String> ht1 = new HashMap<>();
        HashMap<String, String> ht2 = new HashMap<>();

        assertEquals("[]", Library.leftJoin(ht1, ht2).toString());


        //test for one empty Hashmap
        HashMap<String, String> ht3 = new HashMap<>();
        ht3.put("fond", "enamored");
        ht3.put("wrath", "anger");
        ht3.put("diligent", "employed");
        ht3.put("outfit", "garb");
        ht3.put("guide", "usher");

        HashMap<String, String> ht4 = new HashMap<>();

        assertEquals("[[diligent, employed, null], [outfit, garb, null], [wrath, anger, null], [guide, usher," +
                " null], [fond, enamored, null]]", Library.leftJoin(ht3, ht4).toString());


        //test when both hashmaps contain the same values.
        HashMap<String, String> ht5 = new HashMap<>();
        ht5.put("fond", "enamored");
        ht5.put("wrath", "anger");
        ht5.put("diligent", "employed");
        ht5.put("outfit", "garb");
        ht5.put("guide", "usher");

        HashMap<String, String> ht6 = new HashMap<>();
        ht6.put("fond", "enamored");
        ht6.put("wrath", "anger");
        ht6.put("diligent", "employed");
        ht6.put("outfit", "garb");
        ht6.put("guide", "usher");

        assertEquals("[[diligent, employed, employed], [outfit, garb, garb], [wrath, anger, anger]," +
                " [guide, usher, usher],"+
                " [fond, enamored, enamored]]", Library.leftJoin(ht5, ht6).toString());


        //test when hash maps with different length
        HashMap<String, String> ht7 = new HashMap<>();
        ht7.put("fond", "enamored");
        ht7.put("wrath", "anger");
        ht7.put("diligent", "employed");
        ht7.put("outfit", "garb");
        ht7.put("guide", "usher");

        HashMap<String, String> ht8 = new HashMap<>();
        ht8.put("fond", "averse");
        ht8.put("something", "delight");

        assertEquals("[[diligent, employed, null], [outfit, garb, null]," +
                " [wrath, anger, null], [guide, usher, null]," +
                " [fond, enamored, averse]]", Library.leftJoin(ht7, ht8).toString());
    }
}
