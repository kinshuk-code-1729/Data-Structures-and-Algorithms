//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        for(int i = 0; i < r; i++){
            StringBuilder newStr = new StringBuilder();
            for(char k : s.toCharArray()){
                if(k == '1'){
                    newStr.append("10");
                }
                else{
                    newStr.append("01");
                }
                if(s.length() < newStr.length()){
                    break;
                }
            }
            s = newStr.toString();
        }
        return s.charAt(n);
    }
}
