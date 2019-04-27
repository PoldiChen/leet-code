package question145;

import java.util.List;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/4/27 15:49
 **/
public class Test {

    public static void main(String[] args) {
        TreeNode rootroot = new TreeNode(1);
        TreeNode node22 = new TreeNode(2);
        TreeNode node33 = new TreeNode(3);
        TreeNode node44 = new TreeNode(4);
        rootroot.left = node33;
        rootroot.right = node22;
        node22.left = node44;
        List<Integer> result = new Solution().postorderTraversal(rootroot);
        for (Integer val : result) {
            System.out.println(val);
        }

    }
}
