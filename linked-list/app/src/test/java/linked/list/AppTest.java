/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void emptyLinkedListTest() {
        LinkedList<Integer> testList = new LinkedList<>();
        String expectedResult="NULL";
        assertEquals(expectedResult,testList.toString());
        assertNull(testList.head);
    }

    @Test void properlyInsertToListTest() {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        String expectedResult="{4} -> {3} -> {2} -> {1} -> NULL";
        assertEquals(expectedResult,testList.toString());

    }

    @Test void headPropertyListTest() {
        LinkedList<Integer> testList1 = new LinkedList<>();
        testList1.insert(1);
        testList1.insert(2);
        testList1.insert(3);
        testList1.insert(4);
        int expectedResult=4;
        assertEquals(expectedResult,testList1.head.value);
        LinkedList<Integer> testList2 = new LinkedList<>();
        testList2.insert(9);
        testList2.insert(8);
        testList2.insert(7);
        int expectedResultTwo=7;
        assertEquals(expectedResultTwo,testList2.head.value);
    }

    @Test void insertMultipleNodesTest() {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        String expectedResult="{5} -> {4} -> {3} -> {2} -> {1} -> NULL";
        assertEquals(expectedResult,testList.toString());
    }

    @Test void includesTest() {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        assertTrue(testList.includes(3));
        assertFalse(testList.includes(10));

    }

    @Test void returnCollectionTest() {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(10);
        testList.insert(-1);
        testList.insert(2);
        testList.insert(6);
        testList.insert(4);
        String expectedResult="{4} -> {6} -> {2} -> {-1} -> {10} -> NULL";
        assertEquals(expectedResult,testList.toString());
    }
//lab 06 tests.
    @Test void appendTest () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.append(6);
        String resultString = "{3} -> {2} -> {1} -> {6} -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void appendMultiValueTest () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        testList.append(4);
        testList.append(5);
        testList.append(6);
        String resultString = "{1} -> {2} -> {3} -> {4} -> {5} -> {6} -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void beforeMiddleTest () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(1);
        testList.append(2);
        testList.append(3);
        testList.insertBefore(2,5);
        String resultString = "{1} -> {5} -> {2} -> {3} -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void beforeFirstTest () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(1);
        testList.append(2);
        testList.append(3);
        testList.insertBefore(1,4);
        String resultString = "{4} -> {1} -> {2} -> {3} -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void afterMiddleTest () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(3);
        testList.append(2);
        testList.append(1);
        testList.insertAfter(2,10);
        String resultString = "{3} -> {2} -> {10} -> {1} -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void afterLastTest () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(1);
        testList.append(2);
        testList.append(3);
        testList.insertAfter(3,5);
        String resultString = "{1} -> {2} -> {3} -> {5} -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    //Test for kthFromEnd
    @Test void kGreaterThanLength () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "Exception" , testList.kthFromEnd(70) );
    }

    @Test void kSameLength () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "{6}" , testList.kthFromEnd(4) );
    }

    @Test void kNegative () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "Exception" , testList.kthFromEnd(-5) );
    }

    @Test void listSize1 () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(6);
        assertEquals( "{6}" , testList.kthFromEnd(0) );
        assertEquals( "Exception" , testList.kthFromEnd(5) );
    }
    @Test void happyPath () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "{8}" , testList.kthFromEnd(2) );
    }

}
