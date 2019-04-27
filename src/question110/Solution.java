package question110;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 16:56
 **/
class Solution {

    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getDepth(node.left);
        int right = getDepth(node.right);
        if (Math.abs(left-right) > 1) {
            isBalanced = false;
        }
        return left > right? left+1: right+1;
    }
}
