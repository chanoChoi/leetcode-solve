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
    public List<Integer> postorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        if (root == null) {
            return list;
        }
        
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.removeLast();
            list.addFirst(cur.val);
            if (cur.left != null) {
                stack.addLast(cur.left);
            }
            if (cur.right != null) {
                stack.addLast(cur.right);
            }
        }
        
        return list;
    }
}