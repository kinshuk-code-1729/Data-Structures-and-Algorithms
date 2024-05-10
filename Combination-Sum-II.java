// User function Template for Java

class Solution {
    List<List<Integer>> res;
    List<Integer> cur;
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        res = new ArrayList<>();
        cur = new ArrayList<>();
        
        Arrays.sort(arr);
        
        dfs(arr, 0 , k);
        return res;
    }
    
    void dfs(int arr[], int idx, int k){
        
        // Base case 1
        if(k == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        // Base case 2
        if(idx == arr.length || k < 0){
            return;
        }
        
        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i - 1]){
                continue;
            }
            
            cur.add(arr[i]);
            
            // Recursive Call
            dfs(arr, i + 1, k - arr[i]);
            
            // Backtracking : remove last value
            cur.remove(cur.size() - 1);
            
        }
    }
}