from functools import reduce
from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        number_of_zeros = nums.count(0)

        if number_of_zeros == 1:
            i = nums.index(0)
            nums.pop(i)
            answer = [0] * (len(nums) + 1)
            answer[i] = reduce(lambda a, b: a * b, nums, 1)
            return answer

        if number_of_zeros >= 2:
            return [0] * len(nums)

        max_multiplication = reduce(lambda a, b: a * b, nums, 1)
        return [
            int(max_multiplication / num)
            for num in nums
        ]
