//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> res = new ArrayList<String>();
        int zeroes = 0, ones = 0;
        StringBuilder cur = new StringBuilder();
        
        helper(N, ones, zeroes, cur, res);
        return res;
    }
    
    void helper(int n, int ones, int zeroes, StringBuilder cur, List<String> res){
        if(n == 0){
            res.add(cur.toString());
            return;
        }
        helper(n - 1, ones + 1, zeroes, new StringBuilder(cur).append("1"), res);
        
        if(ones > zeroes){
            helper(n - 1, ones, zeroes + 1, new StringBuilder(cur).append("0"), res);
        }
    }
}
