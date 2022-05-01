package leet.code.problem0710;

import leet.code.tools.TreeNode;

/**
 * 701. 二叉搜索树中的插入操作
 *
 * @author wbxing
 * @date 2020/09/30
 */
public class Problem701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right =  insertIntoBST(root.right, val);
        }
        return root;
    }
}

