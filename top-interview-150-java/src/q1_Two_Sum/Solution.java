package q1_Two_Sum;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{3,2,4};
        int target = 6;

        int[] twoSum = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(twoSum));
    }

}
