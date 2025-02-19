package cn.oriki.leetcode.valid_palindrome;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/valid-palindrome/">125. 验证回文串</a>}
 * {@code @rating: ⭐️⭐️}
 * {@code @tags: 双指针, 字符串}
 */
public class Solution2 {
    public boolean isPalindrome(String s) {
        // 移出所有的非字母数字字符，并且将字母转换为小写
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // 回文串可以理解为对称位置的字符是相同的，如果不相同就返回 false
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

// 执行用时分布 13ms，击败 17.36%
// 消耗内存分布 43.92MB，击败 19.10%