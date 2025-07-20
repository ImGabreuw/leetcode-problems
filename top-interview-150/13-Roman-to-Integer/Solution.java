import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        String input = "III";
        int result = s.romanToInt(input);
        System.out.println(result);
    }

    public int romanToInt(String s) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);

        // M CM XC IV
        int i = 0;
        int result = 0;
        for (i = 0; i < s.length() - 1; i++) {
            char currentChar = s.charAt(i);
            int currentValue = mapping.get(currentChar);

            char nextChar = s.charAt(i + 1);
            int nextValue = mapping.get(nextChar);

            if (currentValue < nextValue) {
                result += nextValue - currentValue;
                i++;
            } else {
                result += currentValue;
            }
        }

        if (i != s.length()) {
            // Somar o último dígito
            char missingChar = s.charAt(i);
            int missingValue = mapping.get(missingChar);
            result += missingValue;
        }

        return result;
    }

}