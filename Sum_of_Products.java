// User function Template for Java

class Solution {
    static long pairAndSum(int n, long arr[]) {
        long res = 0;
        int[] bits = new int[32];
        Arrays.fill(bits, 0);
        
        for(int i = 0; i < n; i++){
            long t = arr[i];
            int j = 0;
        
            while(t != 0){
                if((t & 1) == 1){
                    bits[j] += 1;
                }
        
                t /= 2;
                j++;
            }
        }
        
        for(int i = 0; i < 32; i++){
            long tmp = bits[i];
            tmp -= 1;
            long setBits = (tmp * (tmp + 1)) / 2;
            res += (setBits * (long) Math.pow(2, i));
        }
        
        return res;
    }
}
