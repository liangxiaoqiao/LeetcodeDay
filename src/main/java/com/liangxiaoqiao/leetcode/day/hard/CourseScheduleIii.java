package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 630
 * title: Course Schedule III
 * href: https://leetcode.com/problems/course-schedule-iii
 * desc: There are n different online courses numbered from 1 to n. Each course has some duration(course length) t and closed on dth day. A course should be taken continuously for t days and must be finished before or on the dth day. You will start at the 1st day.
 * Given n online courses represented by pairs (t,d), your task is to find the maximal number of courses that can be taken.
 * Example:
 * Input: [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
 * Output: 3
 * Explanation:
 * There're totally 4 courses, but you can take 3 courses at most:
 * First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
 * Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day.
 * Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day.
 * The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
 * Note:
 * The integer 1 <= d, t, n <= 10,000.
 * You can't take two courses simultaneously.
 * <p>
 * <p>
 * 中文
 * 序号: 630
 * 标题： 课程表 III
 * 链接： https://leetcode-cn.com/problems/course-schedule-iii
 * 描述： 这里有 n 门不同的在线课程，他们按从 1 到 n 编号。每一门课程有一定的持续上课时间（课程时间）t 以及关闭时间第 d 天。一门课要持续学习 t 天直到第 d 天时要完成，你将会从第 1 天开始。
 *
 * 给出 n 个在线课程用 (t, d) 对表示。你的任务是找出最多可以修几门课。
 *
 *  
 *
 * 示例：
 *
 * 输入: [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
 * 输出: 3
 * 解释:
 * 这里一共有 4 门课程, 但是你最多可以修 3 门:
 * 首先, 修第一门课时, 它要耗费 100 天，你会在第 100 天完成, 在第 101 天准备下门课。
 * 第二, 修第三门课时, 它会耗费 1000 天，所以你将在第 1100 天的时候完成它, 以及在第 1101 天开始准备下门课程。
 * 第三, 修第二门课时, 它会耗时 200 天，所以你将会在第 1300 天时完成它。
 * 第四门课现在不能修，因为你将会在第 3300 天完成它，这已经超出了关闭日期。
 *  
 *
 * 提示:
 * 整数 1 <= d, t, n <= 10,000 。
 * 你不能同时修两门课程。
 *
 * acceptance: 32.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CourseScheduleIii {
    public int scheduleCourse(int[][] courses) {
        return 0;
    }
}