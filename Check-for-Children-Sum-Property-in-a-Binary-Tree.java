/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        return sumChild(root) ? 1 : 0;
    }
    
    public static boolean sumChild(Node root){
        if(root == null){
            return true;
        }
        
        if(root.left == null && root.right ==  null){
            return true;
        }
        
        int sum = 0;
        
        if(root.left != null){
            sum += root.left.data;
        }
        
        if(root.right != null){
            sum += root.right.data;
        }
        
        return (root.data == sum && sumChild(root.left) && sumChild(root.right));
    }
}
