// Min distance between two given nodes of a Binary Tree

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        Node LCA = lca(root,a,b);
        
        return findLevel(LCA,a) + findLevel(LCA,b);
    }
    
    Node lca(Node root, int n1,int n2)
	{
		if(root == null){
		    return null;
		}
		
		if(root.data == n1 || root.data == n2){
		    return root;
		}
		
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		
		if(left != null && right != null){
		    return root;
		}
		
		if(left == null && right != null){
		    return right;
		}
		
		else{
		    return left;
		}
	}
	
	int findLevel(Node root,int x){
	    if(root == null){
	        return -1;
	    }
	    
	    Queue<Node> Q = new LinkedList<>();
	    Q.add(root);
	    
	    int lvl = 0;
	    
	    while(! Q.isEmpty()){
	        int len = Q.size();
	        for(int i = 0; i < len; i++){
	           Node cur = Q.poll();
	           
	           if(cur.data == x){
	               return lvl;
	           }
	           
	           if(cur.left != null){
	               Q.add(cur.left);
	           }
	           
	           if(cur.right != null){
	               Q.add(cur.right);
	           }
	        }
	        lvl += 1;
	    }
	    
	    return -1;
	}
}
