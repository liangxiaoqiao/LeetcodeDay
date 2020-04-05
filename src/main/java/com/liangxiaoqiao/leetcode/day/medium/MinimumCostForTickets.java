package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 983
 * title: Minimum Cost For Tickets
 * href: https://leetcode.com/problems/minimum-cost-for-tickets
 * desc: In a country popular for train travel, you have planned some train travelling one year in advance.  The days of the year that you will travel is given as an array days.  Each day is an integer from 1 to 365.\nTrain tickets are sold in 3 different ways:\na 1-day pass is sold for costs[0] dollars;\na 7-day pass is sold for costs[1] dollars;\na 30-day pass is sold for costs[2] dollars.\nThe passes allow that many days of consecutive travel.  For example, if we get a 7-day pass on day 2, then we can travel for 7 days: day 2, 3, 4, 5, 6, 7, and 8.\nReturn the minimum number of dollars you need to travel every day in the given list of days.\n  Example 1:\nInput: days = [1,4,6,7,8,20], costs = [2,7,15]\nOutput: 11\nExplanation: \nFor example, here is one way to buy passes that lets you travel your travel plan:\nOn day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.\nOn day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.\nOn day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.\nIn total you spent $11 and covered all the days of your travel.\nExample 2:\nInput: days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]\nOutput: 17\nExplanation: \nFor example, here is one way to buy passes that lets you travel your travel plan:\nOn day 1, you bought a 30-day pass for costs[2] = $15 which covered days 1, 2, ..., 30.\nOn day 31, you bought a 1-day pass for costs[0] = $2 which covered day 31.\nIn total you spent $17 and covered all the days of your travel.\n  Note:\n1 <= days.length <= 365\n1 <= days[i] <= 365\ndays is in strictly increasing order.\ncosts.length == 3\n1 <= costs[i] <= 1000
 * <p>
 * 中文
 * 序号: 983
 * 标题： 最低票价
 * 链接： https://leetcode-cn.com/problems/minimum-cost-for-tickets
 * 描述： 在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行。在接下来的一年里，你要旅行的日子将以一个名为 days 的数组给出。每一项是一个从 1 到 365 的整数。
 * 火车票有三种不同的销售方式：
 * 一张为期一天的通行证售价为 costs[0] 美元；
 * 一张为期七天的通行证售价为 costs[1] 美元；
 * 一张为期三十天的通行证售价为 costs[2] 美元。
 * 通行证允许数天无限制的旅行。 例如，如果我们在第 2 天获得一张为期 7 天的通行证，那么我们可以连着旅行 7 天：第 2 天、第 3 天、第 4 天、第 5 天、第 6 天、第 7 天和第 8 天。
 * 返回你想要完成在给定的列表 days 中列出的每一天的旅行所需要的最低消费。
 * 示例 1：
 * 输入：days = [1,4,6,7,8,20], costs = [2,7,15]
 * 输出：11
 * 解释：
 * 例如，这里有一种购买通行证的方法，可以让你完成你的旅行计划：
 * 在第 1 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 1 天生效。
 * 在第 3 天，你花了 costs[1] = $7 买了一张为期 7 天的通行证，它将在第 3, 4, ..., 9 天生效。
 * 在第 20 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 20 天生效。
 * 你总共花了 $11，并完成了你计划的每一天旅行。
 * 示例 2：
 * 输入：days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]
 * 输出：17
 * 解释：
 * 例如，这里有一种购买通行证的方法，可以让你完成你的旅行计划：
 * 在第 1 天，你花了 costs[2] = $15 买了一张为期 30 天的通行证，它将在第 1, 2, ..., 30 天生效。
 * 在第 31 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 31 天生效。
 * 你总共花了 $17，并完成了你计划的每一天旅行。
 * 提示：
 * 1 <= days.length <= 365
 * 1 <= days[i] <= 365
 * days 按顺序严格递增
 * costs.length == 3
 * 1 <= costs[i] <= 1000
 * <p>
 * acceptance: 57.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        return 0;
    }
}