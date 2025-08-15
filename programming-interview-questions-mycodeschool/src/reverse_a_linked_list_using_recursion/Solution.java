package reverse_a_linked_list_using_recursion;

public class Solution {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node append(int data) {
            this.next = new Node(data);
            return this.next;
        }
    }

    /**
     * INPUT: (head) 2 -> 4 -> 3 -> 6 -> null
     *
     * OUTPUT:   null <- 2 <- 4 <- 3 <- 6 (head)
     *
     */

    static class LinkedList {

        private Node head;

        public LinkedList(Node head) {
            this.head = head;
        }

        public void reverse() {
            reverse(this.head);
        }

        private void reverse(Node node) {
            if (node.next == null) {
                this.head = node;
                return;
            }

            reverse(node.next);

            node.next.next = node;
            node.next = null;
        }

        public void print() {
            Node current = this.head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.append(4).append(3).append(6);

        LinkedList list = new LinkedList(head);

        list.print();
        list.reverse();
        list.print();
    }

}
