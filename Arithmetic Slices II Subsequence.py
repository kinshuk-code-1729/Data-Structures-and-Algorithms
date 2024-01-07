class Solution:
    def numberOfArithmeticSlices(self, nums: List[int]) -> int:
        result = 0
        l = len(nums)

        ddict = [defaultdict(int) for _ in range(l)]

        for i in range(l):
            for j in range(i):
                cd = nums[i] - nums[j]
                ddict[i][cd] += 1 + ddict[j][cd]
                result += 1 + ddict[j][cd]

        return result - (l * (l - 1 ) // 2)