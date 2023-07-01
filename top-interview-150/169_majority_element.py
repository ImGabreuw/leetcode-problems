from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority_element = 0
        for current_bit in range(32):
            count = 0
            for i in range(len(nums)):
                if (nums[i] & (1 << current_bit)) != 0:
                    count += 1
            if count > len(nums) / 2:
                majority_element += (1 + current_bit)
        return majority_element
