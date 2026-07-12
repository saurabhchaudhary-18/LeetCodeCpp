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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        func(root, l, 0);
        return l;
    }
    void func(TreeNode root, List<Integer> l, int lvl){
        if(root==null){
            return;
        }
        if(lvl==l.size()){
            l.add(root.val);
        }
        func(root.right, l,lvl+1);
        func(root.left,l,lvl+1);
    }
}