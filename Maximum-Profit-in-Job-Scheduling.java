class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int N = startTime.length;
        int[][] intervals = new int[N][3];
        for(int i=0;i<N;i++){
            intervals[i] = new int[]{startTime[i],endTime[i],profit[i]};
        }    
        Arrays.sort(intervals,(x,y)-> x[1] - y[1]);

        TreeMap<Integer,Integer> dfs = new TreeMap<>();
        dfs.put(0,0);

        for(int[] j:intervals){
            int num = j[2] + dfs.floorEntry(j[0]).getValue();
            if(num > dfs.lastEntry().getValue()){
                dfs.put(j[1],num);
            }
        }
        return dfs.lastEntry().getValue();
    }
}