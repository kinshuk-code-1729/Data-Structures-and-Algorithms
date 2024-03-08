//User function Template for Java

class Solution {
    static String longestSubstring(String s, int n) {
        // code here
        int[][] LCS = new int[n + 1][n + 1];
        int ansLen = 0;
        int I = 0;
        
        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                if(s.charAt(i - 1) == s.charAt(j - 1) && LCS[i - 1][j - 1] + 1 <= (j - i)){
                    LCS[i][j] = LCS[i - 1][j - 1] + 1;
                    if(LCS[i][j] > ansLen){
                        ansLen = LCS[i][j];
                        I = i - 1;
                    }
                }
            }
        }
        
        StringBuilder ans = new StringBuilder();
        if(ansLen > 0){
            for(int i = I - ansLen + 1; i <= I; i++){
                ans.append(s.charAt(i));
            }
        }
        
        else{
            ans.append("-1");
        }
        
        return ans.toString();
    }
};
