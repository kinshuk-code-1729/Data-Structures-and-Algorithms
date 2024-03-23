class Solution {
    int mod = 1000000007;

    int[] Series(int n) {
        int[] fib = new int[n + 1];
        
        fib[0] = 0; fib[1] = 1;
        
        for(int i = 2; i <= n; i++){
            fib[i] = (fib[i - 1] % mod + fib[i - 2] % mod) % mod;
        }
        
        return fib;
    }
}
