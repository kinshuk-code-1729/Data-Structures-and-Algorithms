class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ptr_g = 0;
        int ptr_s = 0;

        while(ptr_g < g.length && ptr_s < s.length){
            if(g[ptr_g] <= s[ptr_s]){
                ptr_g++;
                ptr_s++;
            }
            else{
                ptr_s++;
            }
        }

        return ptr_g;
    }
}