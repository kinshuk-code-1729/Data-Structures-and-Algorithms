//User function Template for Java

class Solution
{
    List<String> lst;
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        lst = new ArrayList<>();
        subset(s, "", 0);
        Collections.sort(lst);
        return lst;
    }
    
    void subset(String s, String cur, int i){
        if(i == s.length() && cur.length() > 0){
            lst.add(cur);
            return;
        }
        
        if(i < s.length()){
            subset(s, cur, i + 1);
            subset(s, cur + s.charAt(i), i + 1);
        }
    }
}
