package cn.oriki.leetcode.finished.symmetric_tree;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/symmetric-tree/">101. 对称二叉树</a>}
 * {@code @rating: ⭐️⭐️⭐️}
 * {@code @tags: 树, 深度优先搜索, 广度优先搜索, 二叉树}
 */
public class Solution {

    /**
     * 递归方式解决是否为对称树的问题
     */
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val
                && check(left.left, right.right)
                && check(left.right, right.left);
    }
}

// 执行用时分布 0ms，击败 100.00%
// 消耗内存分布 40.90MB，击败 62.06%
