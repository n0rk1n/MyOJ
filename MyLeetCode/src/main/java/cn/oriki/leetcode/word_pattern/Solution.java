package cn.oriki.leetcode.word_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/word-pattern/">290. 单词规律</a>}
 * {@code @rating: ⭐️⭐️⭐️⭐️}
 * {@code @tags: 哈希表, 字符串}
 */
public class Solution {

    // ❌，以下为错误方法
    public boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");
        int size = pattern.length();

        // 如果出现两者的长度都不一致的情况，则直接 pass
        if (array.length != size)
            return false;

        // ❌，这里无论用 map<c, s> 还是 map<s, c>，都会出现不能通过测试用例的情况
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(pattern.charAt(i)))
                map.put(pattern.charAt(i), array[i]);
            else {
                String s1 = map.get(pattern.charAt(i));
                if (!s1.equals(array[i]))
                    return false;
            }
        }
        return true;
    }
}