package cn.oriki.leetcode.maximum_depth_of_binary_tree;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree/">104. 二叉树的最大深度</a>}
 * {@code @rating: ⭐️⭐️⭐️}
 * {@code @tags: 树, 深度优先搜索, 广度优先搜索, 二叉树}
 */
public class Solution {

    public int maxDepth(TreeNode node) {
        if (node == null) {
            // 叶子结点
            return 0;
        } else {
            int leftHeight = maxDepth(node.left);
            int rightHeight = maxDepth(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

// 执行用时分布 0ms，击败 100.00%
// 消耗内存分布 41.68MB，击败 73.62%

