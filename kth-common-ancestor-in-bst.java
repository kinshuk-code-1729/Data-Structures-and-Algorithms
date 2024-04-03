// User function Template for Java
class Solution {
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        Node LCA = lca(root, x, y);
        ArrayList<Integer> arr = new ArrayList<>();
        
        search(root, LCA, arr);
        
        return (arr.size() - k < 0) ? -1 : arr.get(arr.size() - k);
    }
    
    void search(Node root, Node x, ArrayList<Integer> arr){
        while(root != null){
            arr.add(root.data);
            if(root.data == x.data){
                return;
            }
            if(root.data < x.data){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
    }
    
    Node lca(Node root, int n1,int n2)
	{
		while(root != null){
		    if(root.data > n1 && root.data > n2){
		        root = root.left;
		    }
		    
		    else if(root.data < n1 && root.data < n2){
		        root = root.right;
		    }
		    
		    else{
		        break;
		    }
		}
		return root;
	}
}
