package question145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 15:46
 **/
class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null) {
            postorderTraversal(root.right);
        }
        result.add(root.val);
        return result;
    }
}
