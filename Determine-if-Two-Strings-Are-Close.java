class Solution {
    public boolean closeStrings(String word1, String word2) {
// both must be equal in length
        if(word1.length() != word2.length()){
            return false;
        }

// convert w1 to char arr & define empty set for it
        int[] c1 = new int[26];
        Set<Character> s1 = new HashSet<>();

// convert w2 to char arr & define empty set for it
        int[] c2 = new int[26];
        Set<Character> s2 = new HashSet<>();

        for(char ch:word1.toCharArray()){
            c1[ch - 'a']++;
            s1.add(ch);
        }

        for(char ch:word2.toCharArray()){
            c2[ch - 'a']++;
            s2.add(ch);
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        return s1.equals(s2) && Arrays.equals(c1,c2);
    }
}