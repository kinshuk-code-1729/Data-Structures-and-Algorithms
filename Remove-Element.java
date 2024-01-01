class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(final int x:nums){
            if(x != val){
                nums[j++] = x;
            }
        }
        return j;
    }
}