/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static ArrayList<ArrayList<Integer>> res;
    static ArrayList<Integer> path;
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        path = new ArrayList<>();
        res = new ArrayList<>();
        
        dfs(root);
        
        return res;
    }
    
    public static void dfs(Node root){
        
        // BASE case
        if(root == null){
            return;
        }
        
        path.add(root.data);
        
        if(root.left == null && root.right == null){
            res.add(new ArrayList<>(path));
        }
        
        else{
            dfs(root.left);
            dfs(root.right);
        }
        
        path.remove(path.size() - 1);
    }
}
