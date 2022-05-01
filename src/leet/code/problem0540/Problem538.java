package leet.code.problem0540;

import java.util.ArrayDeque;
import java.util.Queue;

import leet.code.tools.TreeNode;

/**
 * 538. 把二叉搜索树转换为累加树
 *
 * @author wbxing
 * @date 2020/09/21
 */
public class Problem538 {

    public static void main(String[] args) {

        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(0);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(-4);
        t.left.right = new TreeNode(1);

        Problem538 problem538 = new Problem538();
        TreeNode treeNode = problem538.convertBST(t);


        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(treeNode);
        while (!q.isEmpty()) {
            TreeNode tmp = q.poll();
            System.out.println(tmp.val);
            if (tmp.left != null) {
                q.add(tmp.left);
            }
            if (tmp.right != null) {
                q.add(tmp.right);
            }
        }


    }

    public int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }

}

