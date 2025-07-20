public class Solution {

    public static void main(String[] args) {
        String input = "a";
        Solution s = new Solution();
        int result = s.lengthOfLastWord(input);
        System.out.println(result);
    }

    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (len != 0) {
                    break;
                }

                continue;
            }

            ++len;
        }
        return len;
    }

}
