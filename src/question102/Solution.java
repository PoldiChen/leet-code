package question102;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 16:21
 **/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        List<TreeNode> currentLevelNodes = new ArrayList<>();
        currentLevelNodes.add(root);
        while (!currentLevelNodes.isEmpty()) {
            List<Integer> currentLevelVals = new ArrayList<>();
            List<TreeNode> nextLevelNodes = new ArrayList<>();
            for (TreeNode node : currentLevelNodes) {
                currentLevelVals.add(node.val);
                if (node.left != null) {
                    nextLevelNodes.add(node.left);
                }
                if (node.right != null) {
                    nextLevelNodes.add(node.right);
                }
            }
            result.add(currentLevelVals);
            currentLevelNodes = nextLevelNodes;
        }

        return result;
    }
}
