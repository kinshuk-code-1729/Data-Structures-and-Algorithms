class Solution {
    public int minSteps(String s, String t) {
        int[] alphs = new int[26];

        for(int i=0;i < s.length();i++){
            alphs[s.charAt(i)-'a']++;
            alphs[t.charAt(i)-'a']--;
        }
        int result = 0;

        for(int a: alphs){
            if(a > 0){
                result = result + a;
            }
        }

        return result;
    }
}