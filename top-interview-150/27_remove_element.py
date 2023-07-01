from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        size = len(nums)

        for i in range(1, size + 1):
            if nums[size - i] == val:
                del nums[size - i]

        return len(nums)
