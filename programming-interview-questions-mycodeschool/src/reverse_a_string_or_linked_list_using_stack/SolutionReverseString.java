package reverse_a_string_or_linked_list_using_stack;

import java.util.Stack;

public class SolutionReverseString {

    public String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SolutionReverseString solutionReverseString = new SolutionReverseString();

        String reversed = solutionReverseString.reverseString("Hello World");

        System.out.println(reversed);
    }

}
