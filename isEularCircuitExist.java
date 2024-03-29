// User function Template for Java

class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        if(v == 1){
            return true;
        }
        
        for(int i = 0; i < v; i++){
            if(adj.get(i).size() % 2 != 0){
                return false;
            }
        }
        
        return true;
    }
}
