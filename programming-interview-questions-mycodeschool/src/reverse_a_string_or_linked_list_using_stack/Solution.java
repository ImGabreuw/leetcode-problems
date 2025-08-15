package reverse_a_string_or_linked_list_using_stack;

import java.util.Stack;

public class Solution {

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
        Solution solution = new Solution();

        String reversed = solution.reverseString("Hello World");

        System.out.println(reversed);
    }

}
