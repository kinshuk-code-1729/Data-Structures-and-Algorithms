//User function Template for Java

class Solution
{
    int[][] dp;
    public int TotalCount(String str)
    {
        // Code here
        int s=0,i=0;
        dp = new int[101][1001];
        for(int[] p: dp){
            Arrays.fill(p,-1);
        }
        return calc(str,s,i);
    }
    public int calc(String str,int s,int i){
        if(i >= str.length()) return 1;
        if(dp[i][s] != -1) return dp[i][s];
        
        int curS = 0, res = 0;
        
        for(int j=i;j<str.length();j++){
            curS += (str.charAt(j) - '0');
            if(curS >= s){
                res += calc(str,curS,j+1);
            }
        }
        return dp[i][s] = res;
  }
}
