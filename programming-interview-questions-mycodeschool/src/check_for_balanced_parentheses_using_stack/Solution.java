package check_for_balanced_parentheses_using_stack;

import java.util.Stack;

public class Solution {

    boolean checkBalancedParentheses(String expression) {
        if (expression == null || expression.isBlank()) {
            return false;
        }

        Stack<Character> openedParentheses = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(') {
                openedParentheses.push(c);
            } else if (c == ')') {
                if (openedParentheses.isEmpty()) {
                    return false;
                }
                openedParentheses.pop();
            }
        }

        return openedParentheses.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "(()())";

        Solution solution = new Solution();
        boolean isBalanced = solution.checkBalancedParentheses(expression);

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
