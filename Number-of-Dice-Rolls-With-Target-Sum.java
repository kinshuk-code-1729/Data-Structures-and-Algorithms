class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int [][]dice = new int[n+1][target+1];
        for(int j[]:dice){
            Arrays.fill(j,-1);
        }
        return search(n,k,target,dice);
    }
    private int search(int N,int key,int T,int [][] die){
        if(N<0 || T<0) return 0;
        if(N==0 && T==0) return 1;
        if(die[N][T] != -1) return die[N][T];
        int poss_ways = 0;
        for(int i=1;i<=key;i++){
            if(i <=T) poss_ways = (poss_ways+search(N-1,key,T-i,die))%1000000007;
        }
        die[N][T] = poss_ways;
        return poss_ways;
    }
}