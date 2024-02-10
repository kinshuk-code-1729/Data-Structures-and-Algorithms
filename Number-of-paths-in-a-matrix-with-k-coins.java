//User function Template for Java

class Solution {
    long result;
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        result = 0;
        dfs(0, 0, arr, k);
        return result;
    }
    
    void dfs(int i, int j, int [][]arr, int k){
        int m = arr.length;
        int n = arr[0].length;
        
        if(k < 0){
            return;
        }
        
        if(i >= 0 && i < m && j >= 0 && j < n){
            if(i == m - 1 && j == n - 1 && k == arr[i][j]){
                result++;
            }
            
            dfs(i + 1, j, arr, k - arr[i][j]);
            dfs(i, j + 1, arr, k - arr[i][j]);
        }
    }
}
