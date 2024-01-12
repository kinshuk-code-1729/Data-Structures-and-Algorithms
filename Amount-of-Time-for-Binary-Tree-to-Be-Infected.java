/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Map<Integer, List<Integer>> map = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        makeGraph(root);
        Deque<Integer> dq = new ArrayDeque<>();
        Set<Integer> v = new HashSet<>();

        dq.offer(start);
        int t = -1;
        while(!dq.isEmpty()){
            t+=1;
            for(int i=dq.size();i>0;i--){
                int cur = dq.pollFirst();
                v.add(cur);

                if(map.containsKey(cur)){
                    for(int u: map.get(cur)){
                        if(!v.contains(u)){
                            dq.offer(u);
                        }
                    }
                }
            }
        }
        return t;
    }
    private void makeGraph(TreeNode node){
        if(node == null){
            return;
        }

        if(node.left != null){
            map.computeIfAbsent(node.val,k->new ArrayList<>()).add(node.left.val);
            map.computeIfAbsent(node.left.val,k->new ArrayList<>()).add(node.val);
        }

        if(node.right != null){
            map.computeIfAbsent(node.val,k->new ArrayList<>()).add(node.right.val);
            map.computeIfAbsent(node.right.val,k->new ArrayList<>()).add(node.val);
        }

        makeGraph(node.left);       
        makeGraph(node.right);       
    }
}