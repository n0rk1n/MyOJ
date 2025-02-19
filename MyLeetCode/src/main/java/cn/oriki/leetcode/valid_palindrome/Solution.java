package cn.oriki.leetcode.valid_palindrome;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/valid-palindrome/">125. 验证回文串</a>}
 * {@code @rating: ⭐️⭐️}
 * {@code @tags: 双指针, 字符串}
 */
public class Solution {

    public boolean isPalindrome(String s) {
        String lowerCase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder string = new StringBuilder(lowerCase);

        StringBuffer reversedString = new StringBuffer(string).reverse();
        return string.toString().contentEquals(reversedString);
    }
}

// 执行用时分布 18ms，击败 6.31%
// 消耗内存分布 44.10MB，击败 12.15%