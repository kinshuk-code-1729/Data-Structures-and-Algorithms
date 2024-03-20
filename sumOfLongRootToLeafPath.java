//User function Template for Java

/*
node class of binary tree
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    int maxLen = 0;
    int maxSum = Integer.MIN_VALUE;
    public int sumOfLongRootToLeafPath(Node root)
    {
        helper(root, 0, 0);
        return maxSum;
    }
    
    public void helper(Node node, int pathLen,int pathSum){
        if(node == null){
            return;
        }
        
        pathLen++;
        pathSum += node.data;
        
        if(pathLen > maxLen || (pathLen == maxLen && pathSum > maxSum)){
            maxLen = pathLen;
            maxSum = pathSum;
        }
        
        helper(node.left, pathLen, pathSum);
        helper(node.right, pathLen, pathSum);
    }
}
