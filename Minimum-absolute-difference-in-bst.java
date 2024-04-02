//User function Template for Java

/*The Node structure is defined as
struct Node {
    int data;
    Node *left;
    Node *right;

};
*/
class Solution
{
    int prev, res;
    int absolute_diff(Node root)
    {
        res = Integer.MAX_VALUE;
        prev = Integer.MAX_VALUE;
        inorder(root);

        return res;
    }
    
    public void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        if(prev != Integer.MAX_VALUE){
            res = Math.min(res, root.data - prev);
        }
        prev = root.data;
        inorder(root.right);
    }
}
