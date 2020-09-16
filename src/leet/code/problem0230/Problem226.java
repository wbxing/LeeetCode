package leet.code.problem0230;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 226. 翻转二叉树
 *
 * @author wbxing
 * @date 2020/09/16
 */
public class Problem226 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        Problem226 problem226 = new Problem226();
        problem226.print(root);
        problem226.print(problem226.invertTree(root));

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = left;

        return root;
    }

    public void print(TreeNode root) {
        if (root == null) {
            return;
        }
        List<Integer> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            lists.add(poll.val);
            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
        System.out.println(lists);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
