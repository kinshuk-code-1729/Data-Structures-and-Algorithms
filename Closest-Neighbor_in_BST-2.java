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
        int res = Integer.MIN_VALUE;
        Node tmp = root;
        
        while(tmp != null){
            if(tmp.key == n){
                return n;
            }
            else if(tmp.key < n){
                res = Math.max(res, tmp.key);
                tmp = tmp.right;
            }
            else{
                tmp = tmp.left;
            }
        }
        
        return res == Integer.MIN_VALUE ? -1 : res;
    }
}
