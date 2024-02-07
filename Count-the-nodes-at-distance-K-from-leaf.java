//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    HashSet<Node> nodes;
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k)
    {
        // Write your code here
        nodes = new HashSet<>();
        traverse(root,k);
        return nodes.size();
    }
    
    void traverse(Node root,int k){
        if(root == null){
            return;
        }
        traverse(root.left,k);
        if(checkNode(root,k)){
            nodes.add(root);
        }
        traverse(root.right,k);
    }
    boolean checkNode(Node root,int k){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return k == 0;
        }
        return checkNode(root.left,k-1) || checkNode(root.right,k-1);
    }

}
