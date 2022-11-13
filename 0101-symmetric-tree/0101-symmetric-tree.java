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
        return isSymmetricTree(root.left, root.right);
    }
    
    public boolean isSymmetricTree(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) {
            return leftNode == rightNode;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        
        return isSymmetricTree(leftNode.right, rightNode.left) && isSymmetricTree(leftNode.left, rightNode.right);
    }
}