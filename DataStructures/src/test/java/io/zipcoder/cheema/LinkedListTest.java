package io.zipcoder.cheema;

import org.junit.*;

public class LinkedListTest {

    LinkedList<String> stringLinkedList = new LinkedList<String>();

    @Test
    public void addTest(){
        String expected ="1\n2\n3\n4\n5";

        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        String actual = stringLinkedList.toString();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void containsTest() throws Exception {
        boolean expected=false;
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        boolean actual=stringLinkedList.contains("5");
        Assert.assertEquals(expected, actual);
    }

}
