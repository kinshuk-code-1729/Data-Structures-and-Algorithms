import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        if(size == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        
        return nums[size/2];
    }
}
