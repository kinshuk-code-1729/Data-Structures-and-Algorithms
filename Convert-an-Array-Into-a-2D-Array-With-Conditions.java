class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int[] occ = new int[nums.length + 1];
        
        for(int x: nums){
            if(++occ[x] > result.size()){
                result.add(new ArrayList<>());
            }
            result.get(occ[x]-1).add(x);
        }
        return result;
    }
}