package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 141
 * title: Linked List Cycle
 * href: https://leetcode.com/problems/linked-list-cycle
 * desc: Given a linked list, determine if it has a cycle in it.
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * Example 2:
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * Example 3:
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 * Follow up:
 * Can you solve it using O(1) (i.e. constant) memory?
 * <p>
 * 中文
 * 序号: 141
 * 标题： 环形链表
 * 链接： https://leetcode-cn.com/problems/linked-list-cycle
 * 描述： 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 * 进阶：
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 * <p>
 * acceptance: 39.1%
 * difficulty: Easy
 * private: False
 * <p>

 */


import com.liangxiaoqiao.leetcode.day.pojo.ListNode;

//TODO init
/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        return false;
    }

}