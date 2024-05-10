class Solution {
    public boolean divisorGame(int n) {
        if(n <= 1){
            return false;
        }
        
        for(int x = 1; x < n; x++){
            if(n % x == 0){
                return !(divisorGame(n - x));
            }
        }
        
        return false;
    }
}