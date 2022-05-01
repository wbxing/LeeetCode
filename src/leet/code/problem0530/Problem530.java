package leet.code.problem0530;

import leet.code.tools.TreeNode;

/**
 * 530. 二叉搜索树的最小绝对差
 *
 * @author wbxing
 * @date 2020/10/12
 */
public class Problem530 {

    int result = Integer.MAX_VALUE;
    int pre = -1;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return -1;
        }
        getMinimumDifference(root.left);
        if (pre != -1) {
            result = Math.min(result, root.val - pre);
        }
        pre = root.val;
        getMinimumDifference(root.right);

        return result;
    }

}


