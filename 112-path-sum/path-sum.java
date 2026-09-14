class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // If tree is empty
        if (root == null) {
            return false;
        }

        // Subtract current node's value
        targetSum -= root.val;

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // Check left or right subtree
        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }
}