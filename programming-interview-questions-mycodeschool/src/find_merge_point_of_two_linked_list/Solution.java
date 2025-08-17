package find_merge_point_of_two_linked_list;

public class Solution {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node append(int data) {
            this.next = new Node(data);
            return this.next;
        }
    }

    int length(Node head) {
        if (head == null) return 0;

        int length = 0;

        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    /**
     *
     * 1 -> 2 -> 3 -> 4 (list 1)
     *      1 -> 2  / (list 2)
     */

    Node findMergePoint(Node head1, Node head2) {
        int m = length(head1);
        int n = length(head2);

        Node reference = head1;
        Node moving = head2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (reference == moving) {
                    return reference;
                }
                moving = moving.next;
            }
            reference = reference.next;
            moving = head2;
        }

        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = head1.next.next;

        Node mergePoint = solution.findMergePoint(head1, head2);
        System.out.println(mergePoint.data);
    }

}
