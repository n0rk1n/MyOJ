package cn.oriki.leetcode.finished.pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/pascals-triangle-ii/">119. 杨辉三角 II</a>}
 * {@code @rating: ⭐️⭐️}
 * {@code @tags: 数组, 动态规划}
 */
public class Solution {

    /**
     * 对 118. 杨辉三角 的修改
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> C = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(C.get(i - 1).get(j - 1) + C.get(i - 1).get(j));
                }
            }
            C.add(row);
        }
        return C.get(rowIndex);
    }
}

// 执行用时分布 2ms，击败 10.54%
// 消耗内存分布 40.34MB，击败 63.19%