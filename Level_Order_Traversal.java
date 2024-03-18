//User function Template for Java

/*
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

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node tmp = q.poll();
            arr.add(tmp.data);
            
            if(tmp.left != null){
                q.add(tmp.left);
            }
            
            if(tmp.right != null){
                q.add(tmp.right);
            }
        }
        
        return arr;
    }
}
