package cn.oriki.leetcode.linked_list_cycle;

import java.util.HashSet;
import java.util.Set;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/linked-list-cycle/">141. 环形链表</a>}
 * {@code @rating: ⭐️⭐️}
 * {@code @tags: 哈希表, 链表, 双指针}
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

// 执行用时分布 4ms，击败 19.78%
// 消耗内存分布 43.97MB，击败 9.29%
