//User function Template for Java

/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree
{
    ArrayList<Integer> arrLst;
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        arrLst = new ArrayList<>();
        dfs(node, arrLst);
        
        if(arrLst.isEmpty()){
            arrLst.add(-1);
        }
        
        Collections.sort(arrLst);
        
        return arrLst;
        
    }
    
    void dfs(Node root, ArrayList<Integer> arrLst){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            return;
        }
        
        if(root.left == null && root.right != null){
            arrLst.add(root.right.data);
        }
        
        else if(root.left != null && root.right == null){
            arrLst.add(root.left.data);
        }
        
        dfs(root.left, arrLst);
        dfs(root.right, arrLst);
        
    }
}
