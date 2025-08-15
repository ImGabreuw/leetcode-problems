package print_elements_of_a_linked_list_in_forward_and_reverse_order_using_recursion;

public class Solution {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node append(int data) {
            next = new Node(data);
            return next;
        }

    }

    public void print(Node head) {
        if (head == null) return;

        System.out.print(head.data + " ");
        print(head.next);
    }

    public void reversePrint(Node head) {
        if (head == null) return;

        reversePrint(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node head = new Node(1);

        head.append(2).append(3).append(4).append(5);

        System.out.println("Forward order:");
        solution.print(head);

        System.out.println("\nReverse order:");
        solution.reversePrint(head);
    }

}
