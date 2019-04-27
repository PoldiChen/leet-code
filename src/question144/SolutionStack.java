package question144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author poldi.chen
 * @className SolutionStack
 * @description TODO
 * @date 2019/4/27 15:35
 **/
public class    SolutionStack {

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.empty()) {
            root = stack.pop();
            result.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
               stack.push(root.left);
            }
        }
        return result;
    }
}
