/* A Binary Tree node
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
    boolean check(Node root)
    {
	// Your code here	
	if(root == null){
	    return true;
	}
	
	Queue<Node> Q = new LinkedList<>();
	Q.add(root);
	
	int lv = 0;
	boolean leaf1 = true;
	int lvLeaf = 0;
	
	while(!Q.isEmpty()){
	    int len = Q.size();
	    for(int i=0;i< len;i++){
	        Node cur = Q.poll();
	        
	        if(cur.left == null && cur.right == null){
	            if(leaf1){
	                lvLeaf = lv;
	                leaf1 = false;
	            }
	            
	            else if(lv != lvLeaf)
	            return false;
	        }
	        
	        if(cur.left != null){
	            Q.add(cur.left);
	        }
	        
	        if(cur.right != null){
	            Q.add(cur.right);
	        }
	    }
	    lv++;
	}
	return true;
  }
}
