package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1140
 * title: Stone Game II
 * href: https://leetcode.com/problems/stone-game-ii
 * desc: Alex and Lee continue their games with piles of stones.  There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].  The objective of the game is to end with the most stones.
 * Alex and Lee take turns, with Alex starting first.  Initially, M = 1.
 * On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M.  Then, we set M = max(M, X).
 * The game continues until all the stones have been taken.
 * Assuming Alex and Lee play optimally, return the maximum number of stones Alex can get.
 * Example 1:
 * Input: piles = [2,7,9,4,4]
 * Output: 10
 * Explanation:  If Alex takes one pile at the beginning, Lee takes two piles, then Alex takes 2 piles again. Alex can get 2 + 4 + 4 = 10 piles in total. If Alex takes two piles at the beginning, then Lee can take all three piles left. In this case, Alex get 2 + 7 = 9 piles in total. So we return 10 since it's larger.
 * Constraints:
 * 1 <= piles.length <= 100
 * 1 <= piles[i] <= 10 ^ 4
 * <p>
 * 中文
 * 序号: 1140
 * 标题： 石子游戏 II
 * 链接： https://leetcode-cn.com/problems/stone-game-ii
 * 描述： 亚历克斯和李继续他们的石子游戏。许多堆石子 排成一行，每堆都有正整数颗石子 piles[i]。游戏以谁手中的石子最多来决出胜负。
 * 亚历克斯和李轮流进行，亚历克斯先开始。最初，M = 1。
 * 在每个玩家的回合中，该玩家可以拿走剩下的 前 X 堆的所有石子，其中 1 <= X <= 2M。然后，令 M = max(M, X)。
 * 游戏一直持续到所有石子都被拿走。
 * 假设亚历克斯和李都发挥出最佳水平，返回亚历克斯可以得到的最大数量的石头。
 * 示例：
 * 输入：piles = [2,7,9,4,4]
 * 输出：10
 * 解释：
 * 如果亚历克斯在开始时拿走一堆石子，李拿走两堆，接着亚历克斯也拿走两堆。在这种情况下，亚历克斯可以拿到 2 + 4 + 4 = 10 颗石子。
 * 如果亚历克斯在开始时拿走两堆石子，那么李就可以拿走剩下全部三堆石子。在这种情况下，亚历克斯可以拿到 2 + 7 = 9 颗石子。
 * 所以我们返回更大的 10。
 * 提示：
 * 1 <= piles.length <= 100
 * 1 <= piles[i] <= 10 ^ 4
 * <p>
 * acceptance: 60.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class StoneGameIi {
    public int stoneGameII(int[] piles) {
        return 0;
    }
}