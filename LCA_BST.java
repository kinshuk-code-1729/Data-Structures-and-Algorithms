//User function Template for Java

class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
         List<Node> lst1 = findPath(root, n1);
         List<Node> lst2 = findPath(root, n2);
         Set<Node> set = new HashSet<>(lst1);
         
         for(int i = lst2.size() - 1; i >= 0; i--){
             if(set.contains(lst2.get(i))){
                 return lst2.get(i);
             }
         }
         return null;
    }
    
    List<Node> findPath(Node root, int target){
        List<Node> path = new ArrayList<>();
        while(root != null){
            path.add(root);
            if(root.data == target){
                break;
            }
            if(root.data < target){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return path;
    }
    
}
