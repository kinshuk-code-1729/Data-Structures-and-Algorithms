//User function Template for Java

class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> arrlst = new ArrayList<>();
        Set<Integer> terms = new HashSet<>();
        
        arrlst.add(0);
        terms.add(0);
        
        for(int i = 1; i < n; i++){
            int res = arrlst.get(i - 1) - i;
            if(res > 0 && !terms.contains(res)){
                arrlst.add(res);
                terms.add(res);
            }
            else{
                arrlst.add(arrlst.get(i - 1) + i);
                terms.add(arrlst.get(i - 1) + i);
            }
        }
        
        return arrlst;
    }
}
