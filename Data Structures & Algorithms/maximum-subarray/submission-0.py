class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        best, s = nums[0], 0
        for i in range(len(nums)):
            s = max(nums[i], s + nums[i])
            best = max(s, best)
        return best