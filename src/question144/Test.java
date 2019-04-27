package question144;

import java.util.List;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/4/27 15:13
 **/
public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        root.left = node3;
        root.right = node2;
        node2.left = node4;
        List<Integer> result = new SolutionStack().preorderTraversal(root);
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}
