// Count ways to N'th Stair
class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        long[] ans = new long[n + 1];
        ans[0] = 1;
        ans[1] = 1;
        for(int i = 2; i <= n; i++){
            ans[i] = ans[i - 2] + 1;
        }
        Long val = new Long(ans[n]);
        return val;
    }
}
