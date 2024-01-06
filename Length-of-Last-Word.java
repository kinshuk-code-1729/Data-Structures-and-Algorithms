class Solution {
    public int lengthOfLastWord(String s) {
        int L = 0;
        String str = s.trim();

        for(int j=0;j<str.length();j++){
            if(str.charAt(j) == ' '){
                L = 0;
            }
            else{
                L += 1;
            }
        }
        return L;
    }
}