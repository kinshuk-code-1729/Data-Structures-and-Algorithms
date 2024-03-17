/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
    {
        int count = 0;
        // 1. Using HashSet 
        /*Map<Integer, Integer> map = new HashMap<>();
        for(int i : head1){
            map.put(i, 1);
        }
        
        for(int j : head2){
            if(map.containsKey(x - j)){
                count++;
            }
        }*/

        // 2. Using HashMap
        Set<Integer> set = new HashSet<>();
        for(int i : head1){
            set.add(i);
        }
        
        for(int j : head2){
            if(set.contains(x - j)){
                count++;
            }
        }
        
        return count;
    }
}
