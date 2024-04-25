// User function Template for Java

class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        // Base Case
        if(n <= 2 || m <= 2){
            return -1;
        }
        
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < m - 2; j++){
                int s = mat[i][j] + mat[i][j + 1] + mat[i][j + 2] + mat[i + 1][j + 1] + mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2];
                res = Math.max(res, s);
            }
        }
        
        return res;
    }
};
