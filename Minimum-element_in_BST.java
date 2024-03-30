/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        if(root == null){
            return -1;
        }
        Node cur = root;
        while(cur.left != null){
            cur = cur.left;
        }
        return cur.data;
    }
}
