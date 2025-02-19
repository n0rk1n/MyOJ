package cn.oriki.leetcode.finished.remove_duplicates_from_sorted_array;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/">26. 删除有序数组中的重复项</a>}
 * {@code @rating: ⭐️⭐️}
 * {@code @tags: 数组, 双指针}
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        // 特殊情况排除
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}

// 执行用时分布 0ms，击败 100.00%
// 消耗内存分布 43.98MB，击败 66.20%
