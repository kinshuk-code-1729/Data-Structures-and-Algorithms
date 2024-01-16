class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {  
        // create empty solution 2D array
        List<List<Integer>> result = new ArrayList<>();

        // define set for all players , winners and losers
        Set<Integer> players = new HashSet<>();      
        Set<Integer> winners = new HashSet<>();      
        Set<Integer> losers = new HashSet<>();      

        Map<Integer,Integer> lostUpdate = new HashMap<>(); // it will update loosecount

        Set<Integer> lostOnly1 = new HashSet<>(); // keeps track of only 1 match lost plyr

        for(int[] m: matches){
            players.add(m[0]); // add match winner
            players.add(m[1]); // add match loser
            losers.add(m[1]); // add match loser to losers list

            int lostCount = lostUpdate.getOrDefault(m[1],0); // if lost then make it 1
            lostUpdate.put(m[1],lostCount+1); // if lost again, increment lost count
        }

        for(int p : players){
            if(!losers.contains(p)){ // if player not in losers
                winners.add(p);
            }
        }

        for(Map.Entry<Integer,Integer> e : lostUpdate.entrySet()){ // for lost entry
            if(e.getValue() == 1){ // if lost count is 1
                lostOnly1.add(e.getKey());
            }
        }

        // Create winner List and lost only one list
        List<Integer> allWinners = new ArrayList<>(winners);
        List<Integer> listLost1 = new ArrayList<>(lostOnly1);

        // answer should be in increasing order
        Collections.sort(allWinners);
        Collections.sort(listLost1);

        // add these two lists to final result 2D Array
        result.add(new ArrayList<>(allWinners));
        result.add(listLost1);

        return result;
    }
}