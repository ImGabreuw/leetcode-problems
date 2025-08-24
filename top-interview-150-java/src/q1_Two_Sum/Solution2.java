package q1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        //  Value    Index
        Map<Integer, Integer> indexedValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (indexedValue.containsKey(complement)) {
                return new int[]{ indexedValue.get(complement), i};
            }

            indexedValue.put(nums[i], i);
        }

        return new int[]{}; // not occur as per problem constraints
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] nums = new int[]{3,2,4};
        int target = 6;

        int[] twoSum = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(twoSum));
    }

}
