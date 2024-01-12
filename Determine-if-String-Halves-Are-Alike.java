class Solution {
    public boolean halvesAreAlike(String s) {
         Set vow_chars = Set.of('A','E','I','O','U','a','e','i','o','u');
         int vow_left = 0,vow_right = 0;

         int half1 = 0,half2 = s.length()-1;

         while(half1 < half2){
             vow_left += vow_chars.contains(s.charAt(half1))?1:0;
             vow_right += vow_chars.contains(s.charAt(half2))?1:0;
             half1++;
             half2--;
         }

         return vow_left == vow_right;
    }
}