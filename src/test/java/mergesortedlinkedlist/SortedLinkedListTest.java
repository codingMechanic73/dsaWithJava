package mergesortedlinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedLinkedListTest {

    @Test
    void checkIfSorted() {
        Node<Integer> nodeHead1 = new Node<>(1);
        nodeHead1.next = new Node<>(2);
        nodeHead1.next.next = new Node<>(4);
        nodeHead1.next.next.next = new Node<>(8);

        Node<Integer> nodeHead2 = new Node<>(2);
        nodeHead2.next = new Node<>(4);
        nodeHead2.next.next = new Node<>(6);
        nodeHead2.next.next.next = new Node<>(7);

        Node<Integer> nodeHead = new Node<>(1);
        nodeHead.next = new Node<>(2);
        nodeHead.next.next = new Node<>(2);
        nodeHead.next.next.next = new Node<>(4);
        nodeHead.next.next.next.next = new Node<>(4);
        nodeHead.next.next.next.next.next = new Node<>(6);
        nodeHead.next.next.next.next.next.next = new Node<>(7);
        nodeHead.next.next.next.next.next.next.next = new Node<>(8);

        Node<Integer> resultHead = SortedLinkedList.merge(nodeHead1, nodeHead2);
        Assertions.assertEquals(nodeHead, resultHead);
    }

}