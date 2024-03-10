//User function Template for Java
class Solution {
    String removeDuplicates(String str) {
        StringBuilder newStr = new StringBuilder();
        Set<Character> chSet = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!chSet.contains(ch)){
                chSet.add(ch);
                newStr.append(ch);
            }
        }
        return newStr.toString();
    }
}
