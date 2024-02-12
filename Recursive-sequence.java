//User function Template for Java

class Solution{
    static int modVal = 1000000007;
    static long sequence(int n){
        // code here
        long res = helper(1, 1, n);
        return res;
    }
    
    static long helper(int t, int st, int n){
        if(t > n){
            return 0;
        }
        
        long res = 1;
        
        for(int i = 0; i < t; i++){
            res *= st;
            res %= modVal;
            st += 1;
        }
        
        res += helper(t + 1, st, n);
        res %= modVal;
        
        return res;
    } 
}
