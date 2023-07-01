from typing import List


class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k = k % n
        nums[:n - k] = nums[:n - k][::-1]
        print(nums)
        nums[n - k:] = nums[n - k:][::-1]
        print(nums)
        nums[:] = nums[::-1]
        print(nums)
