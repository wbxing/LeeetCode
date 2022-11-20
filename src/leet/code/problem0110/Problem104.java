package leet.code.problem0110;

import leet.code.tools.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 *
 * @author wbxing
 * @date 2020/09/27
 */
public class Problem104 {

    public static void main(String[] args) {
        Problem104 problem104 = new Problem104();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(4);
        t1.left.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);

        System.out.println(problem104.maxDepth(t1));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        List<TreeNode> l = new ArrayList<>();
        int layer = 0;
        // int size = 0;
        q.add(root);
        // layer++;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                TreeNode poll = q.poll();
                assert poll != null;
                if (poll.left != null) {
                    q.add(poll.left);
                }
                if (poll.right != null) {
                    q.add(poll.right);
                }
                size--;
            }
            layer++;
        }
        return layer;
    }
}