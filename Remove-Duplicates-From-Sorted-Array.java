class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return n;
        }
        int v0 = 0,v1 = 1;
        while(v1 < n){
            if(nums[v0] == nums[v1]){
                v1++;
            }
            else{
                v0++;
                nums[v0] = nums[v1];
                v1++;
            }
        }
        int[] x = Arrays.copyOf(nums,v0+1);
        int m = x.length;
        return m;
    }
}