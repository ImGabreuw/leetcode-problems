from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0

        max_profit = 0
        min_purchase = prices[0]

        for price in prices[1:]:
            max_profit = max(max_profit, price - min_purchase)
            min_purchase = min(min_purchase, price)

        return max_profit
