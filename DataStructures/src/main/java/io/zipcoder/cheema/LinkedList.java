package io.zipcoder.cheema;


public class LinkedList<E extends Comparable<E>> {

    private int size;
    private Node head;
    private Node tail;

    public void add(E value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            tail.nextNode = new Node(value);
            tail = tail.nextNode;
        }
    }

//    public void remove(int index) {
//        if (index == 0) {
//            head = head.nextNode;
//        } else {
//            get(index - 1).setNextNode(get(index + 1));
//        }
//        size--;
//    }

    public boolean contains(E value) {
        if (find(value) == -1)
            return true;
        else
            return false;
    }

    public int find(E value) {
        return 0;
    }

    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.nextNode;
            }
        return size;
        }


    public E get() {
        return null;
    }

    public E copy() {
        return null;
    }

    public E sort() {
        return null;
    }

    public String toString() {
        Node next = head;
        String list = "";
        while (next.nextNode != null) {
            list += next.value+"\n";
            next = next.nextNode;
        }
        list += next.value;
        return list;
    }


    class Node {

        private Node nextNode;
        public E value;

        Node(E value) {
            this.value = value;
        }
    }
}
