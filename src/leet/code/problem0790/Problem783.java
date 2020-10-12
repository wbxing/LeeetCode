package leet.code.problem0790;

/**
 * 783. 二叉搜索树节点最小距离
 *
 * @author wbxing
 * @date 2020/10/12
 */
public class Problem783 {
    int result = Integer.MAX_VALUE;
    int pre = -1;

    public int minDiffInBST(TreeNode root) {

        traversal(root);
        return result;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        if (pre != -1) {
            result = Math.min(result, root.val - pre);
        }
        pre = root.val;
        traversal(root.right);
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