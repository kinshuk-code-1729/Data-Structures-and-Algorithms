class Solution
{
    public int min_operations(int []nums)
    {
        int N = nums.length;
        int[] lst = new int[N];
        lst[0] = 1;
        int ans = lst[0];
        
        for(int i = 1; i < N; i++){
            lst[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i] && nums[i] - nums[j] > i - j - 1){
                    lst[i] = Math.max(lst[i], lst[j] + 1);
                }
            }
            ans = Math.max(ans, lst[i]);
        }
        
        return N - ans;
    }
}
