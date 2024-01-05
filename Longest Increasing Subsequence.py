class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        sinc_subsq = [1] * len(nums)

        for i in range(1,len(nums)):
            for j in range(i):
                if nums[j] < nums[i]:
                    sinc_subsq[i] = max(sinc_subsq[i],sinc_subsq[j]+1)

        return max(sinc_subsq)
