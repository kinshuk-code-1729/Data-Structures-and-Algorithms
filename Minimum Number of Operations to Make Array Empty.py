class Solution:
    def minOperations(self, nums: List[int]) -> int:
        cnt = Counter(nums)
        result = 0

        for n,c in cnt.items():
            if c == 1:
                return -1
            
            result += math.ceil(c / 3)

        return result
