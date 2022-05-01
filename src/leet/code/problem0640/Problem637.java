package leet.code.problem0640;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import leet.code.tools.TreeNode;

/**
 * 637. 二叉树的层平均值
 *
 * @author wbxing
 * @date 2020/09/12
 */
public class Problem637 {

    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                TreeNode poll = queue.poll();
                assert poll != null;
                sum += poll.val;
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            list.add(sum / size);
        }
        return list;
    }
}

