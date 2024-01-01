class Solution {
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        if(N <= 2){
            return N;
        }            

        int t1 = 1;
        int t2 = 2;

        while(t2 < N){
            if(nums[t2] == nums[t1] && nums[t2] == nums[t1-1]){
                t2++;
            }
            else{
                t1++;
                nums[t1] = nums[t2];
                t2++;
            }
        }
        return t1+1;
    }
}
