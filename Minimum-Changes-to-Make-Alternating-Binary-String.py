class Solution:
    def minOperations(self, s: str) -> int:
        k = 0

        for j in range(len(s)):
            if j % 2 != 0:
                if s[j] == "0":
                    k += 1
            else:
                if s[j] == "1":
                    k += 1
        
        return min(k,len(s) - k)
