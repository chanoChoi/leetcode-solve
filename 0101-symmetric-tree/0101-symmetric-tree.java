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
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null && rightNode != null) {
            return false;
        }
        if (leftNode != null && rightNode == null) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        boolean a = isSymmetricTree(leftNode.left, rightNode.right);
        boolean b = isSymmetricTree(leftNode.right, rightNode.left);
        
        return a == false ? false : b == false ? false : true;
    }
}