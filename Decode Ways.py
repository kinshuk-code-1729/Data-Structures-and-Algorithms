class Solution:
    def numDecodings(self, s: str) -> int:
        dcv = {len(s): 1}

        for i in range(len(s)-1, -1, -1):
            if s[i] == "0":
                dcv[i] = 0
            else:
                dcv[i] = dcv[i+1]
            if (i + 1 < len(s) and (
                s[i] == "1" or s[i] == "2" and s[i + 1] in "0123456"
            )):
                dcv[i] = dcv[i] + dcv[i + 2]

        return dcv[0]