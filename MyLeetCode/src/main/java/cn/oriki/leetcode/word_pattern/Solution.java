package cn.oriki.leetcode.word_pattern;

import java.util.Arrays;
import java.util.List;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/word-pattern/">290. 单词规律</a>}
 * {@code @rating: ⭐️⭐️⭐️⭐️}
 * {@code @tags: 哈希表, 字符串}
 */
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        List<String> ls = Arrays.asList(s.split(" "));
        int n = pattern.length();
        if (n != ls.size())
            return false;
        for (int i = 0; i < n; i++) {
            // index 在 pattern 中表示的字符，在第一次出现在 pattern 中的位置
            int i1 = pattern.indexOf(pattern.charAt(i));
            // index 在 ls 中表示的字符，在第一次出现在 ls 的位置比较
            int i2 = ls.indexOf(ls.get(i));
            if (i1 != i2)
                return false;
        }
        return true;
    }
}
