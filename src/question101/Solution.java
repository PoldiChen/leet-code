package question101;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 17:36
 **/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSym(root.left, root.right);
    }

    private boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && isSym(left.left, right.right) && isSym(left.right, right.left);
    }
}
