class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(m.containsKey(a[i])){
                m.put(a[i], m.get(a[i]) + 1);
            }
            else{
                m.put(a[i],1);
            }
            
            if(k == m.get(a[i])){
                return a[i];
            }
        }
        
        return -1;
    } 
}
