//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> arr = new ArrayList<>();
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    s1.push(root);
	    
	    while(!s1.isEmpty() || !s2.isEmpty()){
	        while(!s1.isEmpty()){
	            Node tmp = s1.pop();
	           // System.out.print(tmp.data + " ");
	            arr.add(tmp.data);
	            
	            if(tmp.left != null){
	                s2.push(tmp.left);
	            }
	            
	            if(tmp.right != null){
	                s2.push(tmp.right);
	            }
	        }
	        
	        while(!s2.isEmpty()){
	            Node tmp = s2.pop();
	           // System.out.print(tmp.data + " ");
	            arr.add(tmp.data);
	            
	            if(tmp.right != null){
	                s1.push(tmp.right);
	            }
	            
	            if(tmp.left != null){
	                s1.push(tmp.left);
	            }
	        }
	    }
	    return arr;
	}
}
