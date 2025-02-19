package cn.oriki.leetcode.finished.merge_sorted_array;

import java.util.Arrays;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/merge-sorted-array/">88. 合并两个有序数组</a>}
 * {@code @rating: ⭐️}
 * {@code @tags: 数组, 双指针, 排序}
 */
public class Solution {

    /**
     * 采用库函数的方式解决
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0)
            System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}

// 执行用时分布 1ms，击败 29.98%
// 消耗内存分布 41.61MB，击败 7.86%