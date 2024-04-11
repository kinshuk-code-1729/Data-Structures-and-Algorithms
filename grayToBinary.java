// Gray to Binary Conversion
class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int res = 0;
        
        while(n > 0){
            res ^= n;
            n >>= 1; // same as n = n / 2
        }
        
        return res;
        
    }
       
}
