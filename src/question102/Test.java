package question102;

import java.util.List;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/4/27 16:39
 **/
public class Test {

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        List<List<Integer>> result = new Solution().levelOrder(node3);
        for (List<Integer> list : result) {
            for (Integer val : list) {
                System.out.println(val);
            }
            System.out.println("**************");
        }
    }
}
