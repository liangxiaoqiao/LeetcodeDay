package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 781
 * title: Rabbits in Forest
 * href: https://leetcode.com/problems/rabbits-in-forest
 * desc: In a forest, each rabbit has some color. Some subset of rabbits (possibly all of them) tell you how many other rabbits have the same color as them. Those answers are placed in an array.
 * Return the minimum number of rabbits that could be in the forest.
 * Examples:
 * Input: answers = [1, 1, 2]
 * Output: 5
 * Explanation:
 * The two rabbits that answered "1" could both be the same color, say red.
 * The rabbit than answered "2" can't be red or the answers would be inconsistent.
 * Say the rabbit that answered "2" was blue.
 * Then there should be 2 other blue rabbits in the forest that didn't answer into the array.
 * The smallest possible number of rabbits in the forest is therefore 5: 3 that answered plus 2 that didn't.
 * <p>
 * Input: answers = [10, 10, 10]
 * Output: 11
 * <p>
 * Input: answers = []
 * Output: 0
 * Note:
 * answers will have length at most 1000.
 * Each answers[i] will be an integer in the range [0, 999].
 * <p>
 * 中文
 * 序号: 781
 * 标题： 森林中的兔子
 * 链接： https://leetcode-cn.com/problems/rabbits-in-forest
 * 描述： 森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在 answers 数组里。
 *
 * 返回森林中兔子的最少数量。
 *
 * 示例:
 * 输入: answers = [1, 1, 2]
 * 输出: 5
 * 解释:
 * 两只回答了 "1" 的兔子可能有相同的颜色，设为红色。
 * 之后回答了 "2" 的兔子不会是红色，否则他们的回答会相互矛盾。
 * 设回答了 "2" 的兔子为蓝色。
 * 此外，森林中还应有另外 2 只蓝色兔子的回答没有包含在数组中。
 * 因此森林中兔子的最少数量是 5: 3 只回答的和 2 只没有回答的。
 *
 * 输入: answers = [10, 10, 10]
 * 输出: 11
 *
 * 输入: answers = []
 * 输出: 0
 * 说明:
 * answers 的长度最大为1000。
 * answers[i] 是在 [0, 999] 范围内的整数。
 *

 * acceptance: 53.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RabbitsInForest{
    public int numRabbits(int[] answers) {
        return 0;
    }
}