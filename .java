class Solution {
    public int findDuplicate(int[] nums) {
      
        // Approach I : Using HashMap 
        /* Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            else{
                res = nums[i];
                break;
            }
        }
        return res; */
        
        // Approach II : Using HashSet
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
