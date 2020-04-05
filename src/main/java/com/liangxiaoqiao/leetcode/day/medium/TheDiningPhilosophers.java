package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1226
 * title: The Dining Philosophers
 * href: https://leetcode.com/problems/the-dining-philosophers
 * desc: Five silent philosophers sit at a round table with bowls of spaghetti. Forks are placed between each pair of adjacent philosophers.
 * Each philosopher must alternately think and eat. However, a philosopher can only eat spaghetti when they have both left and right forks. Each fork can be held by only one philosopher and so a philosopher can use the fork only if it is not being used by another philosopher. After an individual philosopher finishes eating, they need to put down both forks so that the forks become available to others. A philosopher can take the fork on their right or the one on their left as they become available, but cannot start eating before getting both forks.
 * Eating is not limited by the remaining amounts of spaghetti or stomach space; an infinite supply and an infinite demand are assumed.
 * Design a discipline of behavior (a concurrent algorithm) such that no philosopher will starve; i.e., each can forever continue to alternate between eating and thinking, assuming that no philosopher can know when others may want to eat or think.
 * The problem statement and the image above are taken from wikipedia.org
 * The philosophers' ids are numbered from 0 to 4 in a clockwise order. Implement the function void wantsToEat(philosopher, pickLeftFork, pickRightFork, eat, putLeftFork, putRightFork) where:
 * philosopher is the id of the philosopher who wants to eat.
 * pickLeftFork and pickRightFork are functions you can call to pick the corresponding forks of that philosopher.
 * eat is a function you can call to let the philosopher eat once he has picked both forks.
 * putLeftFork and pickRightFork are functions you can call to put down the corresponding forks of that philosopher.
 * The philosophers are assumed to be thinking as long as they are not asking to eat (the function is not being called with their number).
 * Five threads, each representing a philosopher, will simultaneously use one object of your class to simulate the process. It is possible that the function will be called for the same philosopher more than once, even before the last call ends.
 * Example 1:
 * Input: n = 1
 * Output: [[4,2,1],[4,1,1],[0,1,1],[2,2,1],[2,1,1],[2,0,3],[2,1,2],[2,2,2],[4,0,3],[4,1,2],[0,2,1],[4,2,2],[3,2,1],[3,1,1],[0,0,3],[0,1,2],[0,2,2],[1,2,1],[1,1,1],[3,0,3],[3,1,2],[3,2,2],[1,0,3],[1,1,2],[1,2,2]]
 * Explanation:
 * n is the number of times each philosopher will call the function.
 * The output array describes the calls you made to the functions controlling the forks and the eat function, its format is:
 * output[i] = [a, b, c] (three integers)
 * - a is the id of a philosopher.
 * - b specifies the fork: {1 : left, 2 : right}.
 * - c specifies the operation: {1 : pick, 2 : put, 3 : eat}.
 * Constraints:
 * 1 <= n <= 60
 * <p>
 * 中文
 * 序号: 1226
 * 标题： 哲学家进餐
 * 链接： https://leetcode-cn.com/problems/the-dining-philosophers
 * 描述： 5 个沉默寡言的哲学家围坐在圆桌前，每人面前一盘意面。叉子放在哲学家之间的桌面上。（5 个哲学家，5 根叉子）
 * 所有的哲学家都只会在思考和进餐两种行为间交替。哲学家只有同时拿到左边和右边的叉子才能吃到面，而同一根叉子在同一时间只能被一个哲学家使用。每个哲学家吃完面后都需要把叉子放回桌面以供其他哲学家吃面。只要条件允许，哲学家可以拿起左边或者右边的叉子，但在没有同时拿到左右叉子时不能进食。
 * 假设面的数量没有限制，哲学家也能随便吃，不需要考虑吃不吃得下。
 * 设计一个进餐规则（并行算法）使得每个哲学家都不会挨饿；也就是说，在没有人知道别人什么时候想吃东西或思考的情况下，每个哲学家都可以在吃饭和思考之间一直交替下去。
 * 问题描述和图片来自维基百科 wikipedia.org
 * 哲学家从 0 到 4 按 顺时针 编号。请实现函数 void wantsToEat(philosopher, pickLeftFork, pickRightFork, eat, putLeftFork, putRightFork)：
 * philosopher 哲学家的编号。
 * pickLeftFork 和 pickRightFork 表示拿起左边或右边的叉子。
 * eat 表示吃面。
 * putLeftFork 和 pickRightFork 表示放下左边或右边的叉子。
 * 由于哲学家不是在吃面就是在想着啥时候吃面，所以思考这个方法没有对应的回调。
 * 给你 5 个线程，每个都代表一个哲学家，请你使用类的同一个对象来模拟这个过程。在最后一次调用结束之前，可能会为同一个哲学家多次调用该函数。
 * 示例：
 * 输入：n = 1
 * 输出：[[4,2,1],[4,1,1],[0,1,1],[2,2,1],[2,1,1],[2,0,3],[2,1,2],[2,2,2],[4,0,3],[4,1,2],[0,2,1],[4,2,2],[3,2,1],[3,1,1],[0,0,3],[0,1,2],[0,2,2],[1,2,1],[1,1,1],[3,0,3],[3,1,2],[3,2,2],[1,0,3],[1,1,2],[1,2,2]]
 * 解释:
 * n 表示每个哲学家需要进餐的次数。
 * 输出数组描述了叉子的控制和进餐的调用，它的格式如下：
 * output[i] = [a, b, c] (3个整数)
 * - a 哲学家编号。
 * - b 指定叉子：{1 : 左边, 2 : 右边}.
 * - c 指定行为：{1 : 拿起, 2 : 放下, 3 : 吃面}。
 * 如 [4,2,1] 表示 4 号哲学家拿起了右边的叉子。
 * 提示：
 * 1 <= n <= 60
 * <p>
 * acceptance: 46.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
class TheDiningPhilosophers {
    public TheDiningPhilosophers() {
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
    }
}

