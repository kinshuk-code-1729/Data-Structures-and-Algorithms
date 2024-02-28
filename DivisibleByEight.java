//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        int x;
        if(s.length() <= 3){
            x = Integer.parseInt(s);
        }
        else{
            String sub = s.substring(s.length() - 3);
            x = Integer.parseInt(sub);
        }
        if(x % 8 == 0){
                return 1;
            }
        else{
                return -1;
        }
    }
}