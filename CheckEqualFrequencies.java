//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        int[] freq = new int[26];
        // Count freq.. of all distinct chars
        for(char k : s.toCharArray()){
            freq[k - 'a'] += 1;
        }
        // check for same freq..
        if(check(freq)){
            return true;
        }
        
        // reduce freq. of all char 1 by 1
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                freq[i] -= 1;
                
                if(check(freq)){
                    return true;
                }
                freq[i] += 1;
            }
        }
        return false;
    }
    
    boolean check(int freq[]){
        // first char freq. ==> set to -1 initially
        int N = -1;
        for(int i : freq){
            if(i > 0){
                if(N == -1){
                    N = i;
                }
                else if(i != N){
                    return false;
                }
            }
        }
        return true;
    }
}
