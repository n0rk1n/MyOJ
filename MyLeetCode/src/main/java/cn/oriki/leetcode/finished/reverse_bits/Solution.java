package cn.oriki.leetcode.finished.reverse_bits;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/reverse-bits/">190. 颠倒二进制位</a>}
 * {@code @rating: ⭐️}
 * {@code @tags: 分治, 位运算}
 */
public class Solution {

    /**
     * 调用 Java 库解题。
     */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
