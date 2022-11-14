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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.addLast(root.left);
        stack.addLast(root.right);
        while (!stack.isEmpty()) {
            TreeNode right = stack.removeLast(), left = stack.removeLast();
            if (left == null && right == null) continue;
            if (left == null || right == null || left.val != right.val) return false;
            stack.addLast(left.left);
            stack.addLast(right.right);
            stack.addLast(left.right);
            stack.addLast(right.left);
        }
        
        return true;
    }
}