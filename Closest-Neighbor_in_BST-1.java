// User function Template for Java

/*class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}*/
class Solution {
    public static int findMaxForN(Node root, int n) {
        // Base Case
        if(root == null){
            return -1;
        }
        int res = -1;
        Node tmp = root;
        
        while(tmp != null){
            if(tmp.key < n){
                res = tmp.key;
                tmp = tmp.right;
            }
            else if(tmp.key > n){
                tmp = tmp.left;
            }
            else{
                return tmp.key;
            }
        }
        
        return res;
    }
}
