class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int ans = N;
        for(int i = 0; i < N; i++){
            ans ^= (nums[i] ^ i);
        }
        return ans;
    }
}
