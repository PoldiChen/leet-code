package question094;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 15:58
 **/
class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        if (root.left != null) {
            inorderTraversal(root.left);
        }
        result.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }
        return result;
    }
}
