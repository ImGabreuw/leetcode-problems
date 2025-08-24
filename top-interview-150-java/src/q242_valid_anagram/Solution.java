package q242_valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isValidAnagram(String s, String t) {
        Map<Character, Integer> sAlphabet = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer countLetter = sAlphabet.getOrDefault(c, 0);
            sAlphabet.put(c, countLetter + 1);
        }

        Map<Character, Integer> tAlphabet = new HashMap<>();
        for (char c : t.toCharArray()) {
            Integer countLetter = tAlphabet.getOrDefault(c, 0);
            tAlphabet.put(c, countLetter + 1);
        }

        return sAlphabet.equals(tAlphabet);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "aa";
        String t = "a";
        boolean validAnagram = solution.isValidAnagram(s, t);
        System.out.println(validAnagram);
    }

}
