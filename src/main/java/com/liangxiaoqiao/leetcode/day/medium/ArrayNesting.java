package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 565
 * title: Array Nesting
 * href: https://leetcode.com/problems/array-nesting
 * desc: A zero-indexed array A of length N contains all integers from 0 to N-1. Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.\nSuppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.\n  Example 1:\nInput: A = [5,4,0,3,1,6,2]\nOutput: 4\nExplanation: \nA[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.\n\nOne of the longest S[K]:\nS[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}\n  Note:\nN is an integer within the range [1, 20,000].\nThe elements of A are all distinct.\nEach element of A is an integer within the range [0, N-1].
 * <p>
 * 中文
 * 序号: 565
 * 标题： 数组嵌套
 * 链接： https://leetcode-cn.com/problems/array-nesting
 * 描述： 索引从0开始长度为N的数组A，包含0到N - 1的所有整数。找到并返回最大的集合S，S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }且遵守以下的规则。\n假设选择索引为i的元素A[i]为S的第一个元素，S的下一个元素应该是A[A[i]]，之后是A[A[A[i]]]... 以此类推，不断添加直到S出现重复的元素。\n示例 1:\n输入: A = [5,4,0,3,1,6,2]\n输出: 4\n解释: \nA[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.\n\n其中一种最长的 S[K]:\nS[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}\n注意:\nN是[1, 20,000]之间的整数。\nA中不含有重复的元素。\nA中的元素大小在[0, N-1]之间。
 * <p>
 * acceptance: 54.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        return 0;
    }
}