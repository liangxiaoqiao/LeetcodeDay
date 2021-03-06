package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 900
 * title: None
 * href: None
 * desc: None
 * <p>
 * 中文
 * 序号: 900
 * 标题： RLE 迭代器
 * 链接： https://leetcode-cn.com/problems/rle-iterator
 * 描述： 编写一个遍历游程编码序列的迭代器。\n迭代器由 RLEIterator(int[] A) 初始化，其中 A 是某个序列的游程编码。更具体地，对于所有偶数 i，A[i] 告诉我们在序列中重复非负整数值 A[i + 1] 的次数。\n迭代器支持一个函数：next(int n)，它耗尽接下来的  n 个元素（n >= 1）并返回以这种方式耗去的最后一个元素。如果没有剩余的元素可供耗尽，则  next 返回 -1 。\n例如，我们以 A = [3,8,0,9,2,5] 开始，这是序列 [8,8,8,5,5] 的游程编码。这是因为该序列可以读作 “三个八，零个九，两个五”。\n  示例：\n输入：[\"RLEIterator\",\"next\",\"next\",\"next\",\"next\"], [[[3,8,0,9,2,5]],[2],[1],[1],[2]]\n输出：[null,8,8,5,-1]\n解释：\nRLEIterator 由 RLEIterator([3,8,0,9,2,5]) 初始化。\n这映射到序列 [8,8,8,5,5]。\n然后调用 RLEIterator.next 4次。\n\n.next(2) 耗去序列的 2 个项，返回 8。现在剩下的序列是 [8, 5, 5]。\n\n.next(1) 耗去序列的 1 个项，返回 8。现在剩下的序列是 [5, 5]。\n\n.next(1) 耗去序列的 1 个项，返回 5。现在剩下的序列是 [5]。\n\n.next(2) 耗去序列的 2 个项，返回 -1。 这是由于第一个被耗去的项是 5，\n但第二个项并不存在。由于最后一个要耗去的项不存在，我们返回 -1。\n  提示：\n0 <= A.length <= 1000\nA.length 是偶数。\n0 <= A[i] <= 10^9\n每个测试用例最多调用 1000 次 RLEIterator.next(int n)。\n每次调用 RLEIterator.next(int n) 都有 1 <= n <= 10^9 。
 * <p>
 * acceptance: 40.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
class RleIterator {
    public RleIterator(int[] A) {

    }

    public int next(int n) {
        return 0;
    }
}

/*
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */
