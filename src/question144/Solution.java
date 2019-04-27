package question144;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 15:10
 **/

class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        result.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.right != null) {
            preorderTraversal(root.right);
        }
        return result;
    }

}
