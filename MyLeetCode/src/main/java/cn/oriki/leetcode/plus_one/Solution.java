package cn.oriki.leetcode.plus_one;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/plus-one/">66. 加一</a>}
 * {@code @rating: ⭐️⭐️⭐️}
 * {@code @tags: 数组, 数学}
 */
public class Solution {

    /**
     * 本题其实会出现三种情况，比如
     * <p>
     * 1. 最普通的 78，尾数非九的情况
     * 2. 79 尾数为九的情况
     * 3. 99 全是九的情况
     * <p>
     * 只要对这三种情况逐一处理即可。
     * <p>
     * 时间复杂度：O(n)，其中 n 是数组 digits 的长度。
     * 空间复杂度：O(1)。返回值不计入空间复杂度。
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) { // 将最后的 9 全部换为 0
                digits[i] = 0;
            } else {
                // 非 9 的情况
                digits[i] += 1; // 一旦出现从后往前第一个非 9 元素，则对其 +1 返回
                return digits;
            }
        }

        // 如果所给数组由 n 个 9 组成，则需要对其新建数组，变成 1 加 (n - 1) 个 0
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}