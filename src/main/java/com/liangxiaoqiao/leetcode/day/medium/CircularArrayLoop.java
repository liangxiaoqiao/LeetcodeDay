package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 457
 * title: Circular Array Loop
 * href: https://leetcode.com/problems/circular-array-loop
 * desc: You are given a circular array nums of positive and negative integers. If a number k at an index is positive, then move forward k steps. Conversely, if it\'s negative (-k), move backward k steps. Since the array is circular, you may assume that the last element\'s next element is the first element, and the first element\'s previous element is the last element.\nDetermine if there is a loop (or a cycle) in nums. A cycle must start and end at the same index and the cycle\'s length > 1. Furthermore, movements in a cycle must all follow a single direction. In other words, a cycle must not consist of both forward and backward movements.\n  Example 1:\nInput: [2,-1,1,2,2]\nOutput: true\nExplanation: There is a cycle, from index 0 -> 2 -> 3 -> 0. The cycle\'s length is 3.\nExample 2:\nInput: [-1,2]\nOutput: false\nExplanation: The movement from index 1 -> 1 -> 1 ... is not a cycle, because the cycle\'s length is 1. By definition the cycle\'s length must be greater than 1.\nExample 3:\nInput: [-2,1,-1,-2,-2]\nOutput: false\nExplanation: The movement from index 1 -> 2 -> 1 -> ... is not a cycle, because movement from index 1 -> 2 is a forward movement, but movement from index 2 -> 1 is a backward movement. All movements in a cycle must follow a single direction.\n  Note:\n-1000 ≤ nums[i] ≤ 1000\nnums[i] ≠ 0\n1 ≤ nums.length ≤ 5000\n  Follow up:\nCould you solve it in O(n) time complexity and O(1) extra space complexity?
 * <p>
 * 中文
 * 序号: 457
 * 标题： 环形数组循环
 * 链接： https://leetcode-cn.com/problems/circular-array-loop
 * 描述： 给定一个含有正整数和负整数的环形数组 nums。 如果某个索引中的数 k 为正数，则向前移动 k 个索引。相反，如果是负数 (-k)，则向后移动 k 个索引。因为数组是环形的，所以可以假设最后一个元素的下一个元素是第一个元素，而第一个元素的前一个元素是最后一个元素。\n确定 nums 中是否存在循环（或周期）。循环必须在相同的索引处开始和结束并且循环长度 > 1。此外，一个循环中的所有运动都必须沿着同一方向进行。换句话说，一个循环中不能同时包括向前的运动和向后的运动。\n  示例 1：\n输入：[2,-1,1,2,2]\n输出：true\n解释：存在循环，按索引 0 -> 2 -> 3 -> 0 。循环长度为 3 。\n示例 2：\n输入：[-1,2]\n输出：false\n解释：按索引 1 -> 1 -> 1 ... 的运动无法构成循环，因为循环的长度为 1 。根据定义，循环的长度必须大于 1 。\n示例 3:\n输入：[-2,1,-1,-2,-2]\n输出：false\n解释：按索引 1 -> 2 -> 1 -> ... 的运动无法构成循环，因为按索引 1 -> 2 的运动是向前的运动，而按索引 2 -> 1 的运动是向后的运动。一个循环中的所有运动都必须沿着同一方向进行。\n  提示：\n-1000 ≤ nums[i] ≤ 1000\nnums[i] ≠ 0\n1 ≤ nums.length ≤ 5000\n  进阶：\n你能写出时间时间复杂度为 O(n) 和额外空间复杂度为 O(1) 的算法吗？
 * <p>
 * acceptance: 28.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        return false;
    }
}