
/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Solution{
    ArrayList<Integer> arrLst;
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        arrLst = new ArrayList<Integer>();
        TreeMap<Integer, Integer> tMap = new TreeMap<>();
        
        dfs(root, 0, tMap);
        
        for(int v : tMap.values()){
            arrLst.add(v);
        }
        
        return arrLst;
        
    }
    
    public void dfs(Node root, int dist, TreeMap<Integer, Integer> map){
        if(root == null) return;
        
        dfs(root.left, dist - 1, map);
        
        map.put(dist, map.getOrDefault(dist, 0) + root.data);
        dfs(root.right, dist + 1, map);
    }
}
