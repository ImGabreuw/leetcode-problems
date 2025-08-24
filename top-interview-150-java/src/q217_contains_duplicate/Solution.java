package q217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicates(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            boolean inserted = uniques.add(num);
            if (!inserted) {
                // se não foi inserido é porque o elemento já existe
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
