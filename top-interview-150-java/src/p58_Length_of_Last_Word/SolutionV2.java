package p58_Length_of_Last_Word;

public class SolutionV2 {

    public static void main(String[] args) {
        String input = "a";
        SolutionV2 s = new SolutionV2();
        int result = s.lengthOfLastWord(input);
        System.out.println(result);
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c != ' ') {
                ++len;
            } else {
                break;
            }
        }
        return len;
    }

}
