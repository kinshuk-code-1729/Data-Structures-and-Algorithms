class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] res = new int[q];
        
        for(int i = 0; i < q; i++){
            int x = a[query[i]];
            int count = 0;
            
            for(int k : b){
                if(k <= x){
                    count += 1;
                }
            }
            
            res[i] = count;
        }
        
        return res;
    }
}
