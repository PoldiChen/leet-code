package question104;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 17:01
 **/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
