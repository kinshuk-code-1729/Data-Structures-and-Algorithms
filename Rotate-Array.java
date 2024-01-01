class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length)
            k = k%nums.length;
        int[] r = new int[nums.length];
        for(int j = 0; j < k; j++){
            r[j] = nums[nums.length-k+j];
        }
        int i = 0;
        for(int j=k; j<nums.length; j++){
            r[j] = nums[i];
            i++;
        }
        System.arraycopy(r, 0, nums, 0, nums.length);
    }
}