package reverse_a_string_or_linked_list_using_stack;

import print_2D_array_in_spiral_order.Solution;

import java.util.Stack;

public class SolutionReverseLinkedList {

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

    static class LinkedList {

        Node head;

        LinkedList(Node head) {
            this.head = head;
        }

        void reverse() {
            Stack<Node> stack = new Stack<>();

            Node current = head;
            while (current != null) {
                stack.push(current);
                current = current.next;
            }

            current = stack.pop();
            this.head = current;

            while (!stack.isEmpty()) {
                current.next = stack.pop();
                current = current.next;
            }

            current.next = null;
        }

        void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2).append(3).append(4);

        LinkedList list  = new LinkedList(head);

        list.print();
        list.reverse();
        list.print();
    }

}
