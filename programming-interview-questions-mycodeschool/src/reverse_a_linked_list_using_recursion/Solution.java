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

    Node head;

    public void reverse(Node node) {
        if (node.next == null) {
            head = node;
            return;
        }

        reverse(node.next);

        node.next.next = node;
        node.next = null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.head = new Node(2);
        solution.head.append(4).append(3).append(6);

        solution.reverse(solution.head);

       Node current = solution.head;
       while (current != null) {
           System.out.print(current.data + " ");
           current = current.next;
       }
    }

}
