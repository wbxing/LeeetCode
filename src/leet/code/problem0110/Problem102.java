package leet.code.problem0110;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 * <p>
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * @author wbxing
 * @date 2020/08/24
 */
public class Problem102 {
    public static void main(String[] args) {
        Problem102 problem102 = new Problem102();
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);

        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);
        System.out.println(problem102.levelOrder(t1));

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> results = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int counts = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < counts; i++) {
                TreeNode node = queue.remove(0);
                layer.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            results.add(layer);
        }
        return results;
    }

}

