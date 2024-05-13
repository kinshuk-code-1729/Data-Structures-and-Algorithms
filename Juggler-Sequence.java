// User function Template for Java

class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> res = new ArrayList<>();
        res.add(n);
        
        while(n > 1){
            if(n % 2 == 0){
                n = (long)(Math.sqrt(n));
            }
            
            else{
                n = (long)(Math.sqrt(n) * n);
            }
            
            res.add(n);
        }
        
        return res;
    }
}