//User function Template for Java

class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s){
        final long mod = 1000000007;
        int N = s.length();
        long res = 0;
        long prev = s.charAt(0) - '0';
        long next;
        
        res += prev;
        
        for(int i = 1; i < N; i++){
            next = (i + 1) * (s.charAt(i) - '0') + 10 * prev;
            next %= mod;
            res += next;
            res %= mod;
            prev = next;
        }
        
        return res;
    }
}
