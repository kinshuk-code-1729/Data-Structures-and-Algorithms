


class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer,Integer> FreqMap = new HashMap<>();
        Set<Integer> FreqSet = new HashSet<>();
        
        for(int val: arr){
            FreqMap.put(val,FreqMap.getOrDefault(val,0)+1);
        }
        
        for(int i:FreqMap.values()){
            if(FreqSet.contains(i)){
                return false;
            }
            FreqSet.add(i);
        }
        return true;
    }
}
        
