package q14_Longest_Common_Prefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i = prefix.length() - 1;

        for (int j = 1; j < strs.length; j++) {
            String str = strs[j];
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, i--);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // strs = ["flower","flow","flight"]
        String[] strs = new String[]{"flower","flow","flight"};

        Solution solution = new Solution();
        String result = solution.longestCommonPrefix(strs);

        System.out.println(result);
    }

}
