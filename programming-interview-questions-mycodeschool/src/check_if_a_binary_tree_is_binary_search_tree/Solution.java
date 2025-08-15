package check_if_a_binary_tree_is_binary_search_tree;

public class Solution {

    /**
     * Possíveis Perguntas:
     * <p>
     * 1. Nó deve armazenar um tipo de dados específico ou genérico?
     * 1.1. Se for "genérico" será necessário adicionar uma "chave" (necessariamente numérica, para fins de comparação) e "dado" como tipo genérico
     */
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isBST(Node root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validate(Node node, int min, int max) {
        if (node == null) return true;

        if (node.data < min || node.data > max) return false;

        boolean leftIsValid = validate(node.left, min, node.data);
        boolean rightIsValid = validate(node.right, node.data + 1, max);

        return leftIsValid && rightIsValid;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Node root = new Node(5);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println("É BST? " + solution.isBST(root));
    }

}
