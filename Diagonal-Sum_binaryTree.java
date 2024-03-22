/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
    static ArrayList<Integer> ans;
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ans = new ArrayList<Integer>();
        DFS(root, 0);
        return ans;
    }
    
    public static void DFS(Node node, int level){
        // Base case
        if(node == null){
            return;
        }
        
        if(ans.size() <= level){
            ans.add(node.data);
        }
        else{
            ans.set(level, ans.get(level) + node.data);
        }
        
        // Recursive calls
        DFS(node.right, level); // same level
        DFS(node.left, level + 1); // increment the level by 1
    }
}
