package cn.oriki.leetcode.finished.add_two_numbers;

/**
 * {@code @site: <a href="https://leetcode.cn/problems/add-two-numbers/">2. 两数相加</a>}
 * {@code @rating: ⭐️⭐️⭐️}
 * {@code @tags: 递归, 链表, 数学️}
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 设置头结点，方便后续操作统一
        ListNode pre = new ListNode();
        ListNode res = pre;

        while (l1 != null && l2 != null) { //求和存入新链表
            ListNode node = new ListNode(l1.val + l2.val, null);
            pre.next = node;
            pre = node;
            l1 = l1.next;
            l2 = l2.next;
        }

        // 如果两个链表的长度不相同，则将更长的一个追加到新链表后
        // pre.next = l1 == null ? l2 : l1;
        if (l1 != null) {
            pre.next = l1;
        } else if (l2 != null) {
            pre.next = l2;
        }

        pre = res;
        while (res != null) { // 再遍历进位
            if (res.val > 9) {
                res.val = res.val - 10;
                if (res.next != null) {
                    // 不为空，让下一个元素 ++
                    res.next.val++;
                } else {
                    // 为空，则创建一个新元素，这个元素一定为 1
                    res.next = new ListNode(1, null);
                }
            }
            res = res.next;
        }

        // 返回头结点的下一个结点所构成的链表
        return pre.next;
    }
}