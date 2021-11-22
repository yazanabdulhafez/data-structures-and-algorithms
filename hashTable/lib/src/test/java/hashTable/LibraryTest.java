/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void hashTableTest(){
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
    public void repeatedWord(){
        //Test for un repeated word string
        String testStr="If you want something done right, do it yourself";
        assertEquals("NoRepetition",Library.repeatedWord(testStr));

        //Test for word "a"
        String inputSt="Once upon a time, there was a brave princess who...";
        assertEquals("a",Library.repeatedWord(inputSt));

        //Test for word "it"
        String inputStr="It was the best of times," +
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
        assertEquals("it",Library.repeatedWord(inputStr));

        //Test for word "summer"
        String inputString="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs," +
                " and I didn’t know what I was doing in New York...";
        assertEquals("summer",Library.repeatedWord(inputString));
    }

}