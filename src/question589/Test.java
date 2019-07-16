package question589;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/7/16 14:15
 **/
public class Test {

    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node6 = new Node(6, null);
        List<Node> children3 = new ArrayList<Node>(){
            {
                add(node5);
                add(node6);
            }
        };
        Node node3 = new Node(3, children3);
        Node node2 = new Node(2, null);
        Node node4 = new Node(4, null);
        List<Node> children1 = new ArrayList<Node>(){
            {
                add(node3);
                add(node2);
                add(node4);
            }
        };
        Node node1 = new Node(1, children1);

        List<Integer> result = new Solution().preorder(node1);
        System.out.println(Arrays.toString(result.toArray()));
    }

}
