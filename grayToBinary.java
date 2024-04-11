//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int res = 0;
        
        while(n > 0){
            res ^= n;
            n >>= 1;
        }
        
        return res;
        
    }
       
}
