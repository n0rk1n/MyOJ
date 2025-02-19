package cn.oriki.leetcode.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/pascals-triangle/">118. 杨辉三角</a>}
 * {@code @rating: ⭐️⭐️}
 * {@code @tags: 数组, 动态规划}
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            // 按照每一行开始生成元素
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    // 每行的第一个元素和最后一个元素一定是 1
                    row.add(1);
                } else {
                    // 取出所需要计算元素的左上角元素和右上角元素
                    Integer leftUp = ret.get(i - 1).get(j - 1);
                    Integer rightUp = ret.get(i - 1).get(j);
                    row.add(leftUp + rightUp);
                }
            }
            ret.add(row);
        }
        return ret;
    }
}

// 执行用时分布 1ms，击败 97.30%
// 消耗内存分布 41.07MB，击败 86.56%
