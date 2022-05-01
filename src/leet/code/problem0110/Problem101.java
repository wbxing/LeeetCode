package leet.code.problem0110;

import leet.code.tools.TreeNode;

/**
 * 101. 对称二叉树
 * <p>
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * @author wbxing
 * @date 2020/08/23
 */
public class Problem101 {
    public static void main(String[] args) {
        Problem101 problem101 = new Problem101();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);

        System.out.println(problem101.isSymmetric(t1));

    }

    public boolean isSymmetric(TreeNode root) {

        return mirror(root, root);
    }

    public boolean mirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && (mirror(left.left, right.right) && mirror(left.right, right.left));
    }

}

