package q242_valid_anagram;

public class Solution2 {

    public boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        /*
                  0   1       25
                  a   b       z
        alphabet [0 , 0, ..., 0]
        -> s: char "a"
            -> alphabet[0] += 1
        -> t: char "a"
            -> alphabet[0] -= 1

        loop

        -> Final: soma de alphabet == 0 -> é uma anagrama
         */

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int count : alphabet) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String s = "aa";
        String t = "a";
        boolean validAnagram = solution.isValidAnagram(s, t);
        System.out.println(validAnagram);
    }

}
