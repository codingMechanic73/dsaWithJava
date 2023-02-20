package mergesortedlinkedlist;

public class SortedLinkedList {

    private SortedLinkedList() {}

    public static Node<Integer> merge(Node<Integer> list1, Node<Integer> list2) {
        Node<Integer> head = new Node<>(0);
        Node<Integer> current = head;

        while(list1 != null || list2 != null) {
            Node<Integer> newNode;

            if (list2 == null || (list1 != null && list1.data <= list2.data)) {
                newNode = new Node<>(list1.data);
                list1 = list1.next;
            } else {
                newNode = new Node<>(list2.data);
                list2 = list2.next;
            }
            current.next = newNode;
            current = current.next;
        }

        return head.next;
    }
}
