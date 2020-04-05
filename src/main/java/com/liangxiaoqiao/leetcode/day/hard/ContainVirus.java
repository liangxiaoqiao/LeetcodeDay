package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 749
 * title: Contain Virus
 * href: https://leetcode.com/problems/contain-virus
 * desc: A virus is spreading rapidly, and your task is to quarantine the infected area by installing walls.\nThe world is modeled as a 2-D array of cells, where 0 represents uninfected cells, and 1 represents cells contaminated with the virus. A wall (and only one wall) can be installed between any two 4-directionally adjacent cells, on the shared boundary.\nEvery night, the virus spreads to all neighboring cells in all four directions unless blocked by a wall. Resources are limited. Each day, you can install walls around only one region -- the affected area (continuous block of infected cells) that threatens the most uninfected cells the following night. There will never be a tie.\nCan you save the day? If so, what is the number of walls required? If not, and the world becomes fully infected, return the number of walls used.\nExample 1:\nInput: grid = \n[[0,1,0,0,0,0,0,1],\n [0,1,0,0,0,0,0,1],\n [0,0,0,0,0,0,0,1],\n [0,0,0,0,0,0,0,0]]\nOutput: 10\nExplanation:\nThere are 2 contaminated regions.\nOn the first day, add 5 walls to quarantine the viral region on the left. The board after the virus spreads is:\n\n[[0,1,0,0,0,0,1,1],\n [0,1,0,0,0,0,1,1],\n [0,0,0,0,0,0,1,1],\n [0,0,0,0,0,0,0,1]]\n\nOn the second day, add 5 walls to quarantine the viral region on the right. The virus is fully contained.\nExample 2:\nInput: grid = \n[[1,1,1],\n [1,0,1],\n [1,1,1]]\nOutput: 4\nExplanation: Even though there is only one cell saved, there are 4 walls built.\nNotice that walls are only built on the shared boundary of two different cells.\nExample 3:\nInput: grid = \n[[1,1,1,0,0,0,0,0,0],\n [1,0,1,0,1,1,1,1,1],\n [1,1,1,0,0,0,0,0,0]]\nOutput: 13\nExplanation: The region on the left only builds two new walls.\nNote:\nThe number of rows and columns of grid will each be in the range [1, 50].\nEach grid[i][j] will be either 0 or 1.\nThroughout the described process, there is always a contiguous viral region that will infect strictly more uncontaminated squares in the next round.
 * <p>
 * 中文
 * 序号: 749
 * 标题： 隔离病毒
 * 链接： https://leetcode-cn.com/problems/contain-virus
 * 描述： 病毒扩散得很快，现在你的任务是尽可能地通过安装防火墙来隔离病毒。\n假设世界由二维矩阵组成，0 表示该区域未感染病毒，而 1 表示该区域已感染病毒。可以在任意 2 个四方向相邻单元之间的共享边界上安装一个防火墙（并且只有一个防火墙）。\n每天晚上，病毒会从被感染区域向相邻未感染区域扩散，除非被防火墙隔离。现由于资源有限，每天你只能安装一系列防火墙来隔离其中一个被病毒感染的区域（一个区域或连续的一片区域），且该感染区域对未感染区域的威胁最大且保证唯一。\n你需要努力使得最后有部分区域不被病毒感染，如果可以成功，那么返回需要使用的防火墙个数; 如果无法实现，则返回在世界被病毒全部感染时已安装的防火墙个数。\n  示例 1：\n输入: grid = \n[[0,1,0,0,0,0,0,1],\n [0,1,0,0,0,0,0,1],\n [0,0,0,0,0,0,0,1],\n [0,0,0,0,0,0,0,0]]\n输出: 10\n说明:\n一共有两块被病毒感染的区域: 从左往右第一块需要 5 个防火墙，同时若该区域不隔离，晚上将感染 5 个未感染区域（即被威胁的未感染区域个数为 5）;\n第二块需要 4 个防火墙，同理被威胁的未感染区域个数是 4。因此，第一天先隔离左边的感染区域，经过一晚后，病毒传播后世界如下:\n[[0,1,0,0,0,0,1,1],\n [0,1,0,0,0,0,1,1],\n [0,0,0,0,0,0,1,1],\n [0,0,0,0,0,0,0,1]]\n第二题，只剩下一块未隔离的被感染的连续区域，此时需要安装 5 个防火墙，且安装完毕后病毒隔离任务完成。\n示例 2：\n输入: grid = \n[[1,1,1],\n [1,0,1],\n [1,1,1]]\n输出: 4\n说明: \n此时只需要安装 4 面防火墙，就有一小区域可以幸存，不被病毒感染。\n注意不需要在世界边界建立防火墙。\n  示例 3:\n输入: grid = \n[[1,1,1,0,0,0,0,0,0],\n [1,0,1,0,1,1,1,1,1],\n [1,1,1,0,0,0,0,0,0]]\n输出: 13\n说明: \n在隔离右边感染区域后，隔离左边病毒区域只需要 2 个防火墙了。\n  说明:\ngrid 的行数和列数范围是 [1, 50]。\n grid[i][j] 只包含 0 或 1 。\n题目保证每次选取感染区域进行隔离时，一定存在唯一一个对未感染区域的威胁最大的区域。\n
 * <p>
 * acceptance: 42.5%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ContainVirus {
    public int containVirus(int[][] grid) {
        return 0;
    }
}