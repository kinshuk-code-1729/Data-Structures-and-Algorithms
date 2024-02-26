class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int bits = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            bits++;
        }
        return left << bits;
    }
}
