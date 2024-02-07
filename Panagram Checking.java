//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        Set<Character> alph = new HashSet<>();
 
        for (char k : s.toCharArray()) {
            if (k >= 'a' && k <= 'z')
                alph.add(k);
 
            if (k >= 'A' && k <= 'Z') {
                k = Character.toLowerCase(k);
                alph.add(k);
            }
        }
 
        // check if the size is 26 or not
        return alph.size() == 26;
    }
}
