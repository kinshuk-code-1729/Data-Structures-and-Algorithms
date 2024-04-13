// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        long res = 0, i = 31;
        while(x != 0){
            res += (long) Math.pow(2, i) * (x & 1);
            i--;
            x /= 2;
        }
        return res;
    }
};
