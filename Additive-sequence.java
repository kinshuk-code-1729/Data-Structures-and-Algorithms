// User function Template for Java
class Solution {
    public boolean isAdditiveSequence(String n) {
    
        for(int i = 0; i < n.length() / 2; i++){
            for(int j = i + 1; j < n.length() - 1; j++){
                String x = n.substring(0, i + 1);
                String y = n.substring(i + 1, j + 1);
                String z = n.substring(j + 1);
    
                if(helper(x, y, z)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean helper(String x, String y, String z){
        String s = calcSum(x, y);
        int i = 0, j = 0;
    
        while(i < z.length() && j < s.length()){
            if(z.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
    
        if(j != s.length()){
            return false;
        }
        
        if(i == z.length()){
            return true;
        }
        
        z = z.substring(i);
        return helper(y, s, z);
    }
    
    private static String calcSum(String x, String y){
        int i = x.length() - 1;
        int j = y.length() - 1;
        StringBuilder res = new StringBuilder();
        int c = 0;
        
        while(i >= 0 && j >= 0){
            int s = (x.charAt(i) - '0') + (y.charAt(j) - '0') + c;
            res.append((char) s % 10);
            c = s / 10;
            i--;
            j--;
        }
        
        while(i >= 0){
            int s = (x.charAt(i) - '0') + c;
            res.append((char) s % 10);
            c = s / 10;
            i--;
        }
        
        while(j >= 0){
            int s = (y.charAt(j) - '0') + c;
            res.append((char) s % 10);
            c = s / 10;
            j--;
        }
        
        if(c != 0){
            res.append((char) (c + '0'));
        }
        
        StringBuilder tmp = res.reverse();
        
        return tmp.toString();
    }
}
