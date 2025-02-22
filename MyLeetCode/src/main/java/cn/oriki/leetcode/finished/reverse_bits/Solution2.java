package cn.oriki.leetcode.finished.reverse_bits;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/reverse-bits/">190. 颠倒二进制位</a>}
 * {@code @rating: ⭐️⭐️⭐️⭐️}
 * {@code @tags: 分治, 位运算}
 */
public class Solution2 {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        // 迭代 32 次 || n 为 0 则提前结束
        for (int i = 0; i < 32 && n != 0; i++) {
            // (n & 1): 用于获取 n 的最右边一位的值
            int m = n & 1;
            // m << (31 - i): 用于将结果移动到第 (31 - i) 位上，从 31, 30, ... 0 位
            int m2 = (m) << (31 - i);
            // |=: 用于将计算出的值与当前 rev 值「按位或」运算
            rev |= m2;
            // n >>= 1: 将 n 逻辑右移一位，相当于舍弃最右边一位，高位用 0 填充
            n >>= 1;
        }
        return rev;
    }
}
