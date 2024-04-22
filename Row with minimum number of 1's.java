// User function Template for Java

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int res = -1, minVal = Integer.MAX_VALUE, count = 0;
        
        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = 0; j < m; j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            
            if(count < minVal){
                minVal = count;
                res = i + 1;
            }
        }
        
        return res;
    }
};
