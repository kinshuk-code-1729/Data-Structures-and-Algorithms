class RandomizedSet {
    private Map<Integer,Integer> keyVals;
    private List<Integer> vals;
    private Random r;
    public RandomizedSet() {
        keyVals = new HashMap<>();
        vals = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(keyVals.containsKey(val)){
            return false;
        }
        keyVals.put(val,vals.size());
        vals.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!keyVals.containsKey(val)){
            return false;
        }        
        int delPair = keyVals.get(val);
        int delVal = vals.get(vals.size()-1);
        vals.set(delPair,delVal); // element moved to last place
        keyVals.put(delVal,delPair); // moved element index updated
        vals.remove(vals.size()-1); // now remove last element
        keyVals.remove(val); // remove map pair
        return true;
    }
    
    public int getRandom() {
        int rand_pos = r.nextInt(vals.size());
        return vals.get(rand_pos);        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
