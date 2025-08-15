package reverse_a_linked_list;

public class Solution {

    /**
     * Reverse a linked list.
     *
     * Input:   (head) 2 -> 6 -> 4 -> 3 -> 1 -> null
     *
     *      null <- 2 <- 6 <- 4 <- 3 <- 1 -> null
     *                                        ^ current
     *
     * Output: null <- 2 <- 6 <- 4 <- 3 <- 1 (head)
     */

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node insert(int data) {
            next = new Node(data);
            return next;
        }
    }

    public Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a linked list: 2 -> 6 -> 4 -> 3 -> 1
        Node head = solution.new Node(2);

        Node next = head.insert(6);
        next = next.insert(4);
        next = next.insert(3);
        next = next.insert(1);

        // Reverse the linked list
        Node newHead = solution.reverse(head);

        // Print the reversed linked list
        Node current = newHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
