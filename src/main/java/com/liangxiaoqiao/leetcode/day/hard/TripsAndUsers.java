package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 262
 * title: Trips and Users
 * href: https://leetcode.com/problems/trips-and-users
 * desc: SQL Schema\nThe Trips table holds all taxi trips. Each trip has a unique Id, while Client_Id and Driver_Id are both foreign keys to the Users_Id at the Users table. Status is an ENUM type of (‘completed’, ‘cancelled_by_driver’, ‘cancelled_by_client’).\n+----+-----------+-----------+---------+--------------------+----------+\n| Id | Client_Id | Driver_Id | City_Id |        Status      |Request_at|\n+----+-----------+-----------+---------+--------------------+----------+\n| 1  |     1     |    10     |    1    |     completed      |2013-10-01|\n| 2  |     2     |    11     |    1    | cancelled_by_driver|2013-10-01|\n| 3  |     3     |    12     |    6    |     completed      |2013-10-01|\n| 4  |     4     |    13     |    6    | cancelled_by_client|2013-10-01|\n| 5  |     1     |    10     |    1    |     completed      |2013-10-02|\n| 6  |     2     |    11     |    6    |     completed      |2013-10-02|\n| 7  |     3     |    12     |    6    |     completed      |2013-10-02|\n| 8  |     2     |    12     |    12   |     completed      |2013-10-03|\n| 9  |     3     |    10     |    12   |     completed      |2013-10-03| \n| 10 |     4     |    13     |    12   | cancelled_by_driver|2013-10-03|\n+----+-----------+-----------+---------+--------------------+----------+\nThe Users table holds all users. Each user has an unique Users_Id, and Role is an ENUM type of (‘client’, ‘driver’, ‘partner’).\n+----------+--------+--------+\n| Users_Id | Banned |  Role  |\n+----------+--------+--------+\n|    1     |   No   | client |\n|    2     |   Yes  | client |\n|    3     |   No   | client |\n|    4     |   No   | client |\n|    10    |   No   | driver |\n|    11    |   No   | driver |\n|    12    |   No   | driver |\n|    13    |   No   | driver |\n+----------+--------+--------+\nWrite a SQL query to find the cancellation rate of requests made by unbanned users between Oct 1, 2013 and Oct 3, 2013. For the above tables, your SQL query should return the following rows with the cancellation rate being rounded to two decimal places.\n+------------+-------------------+\n|     Day    | Cancellation Rate |\n+------------+-------------------+\n| 2013-10-01 |       0.33        |\n| 2013-10-02 |       0.00        |\n| 2013-10-03 |       0.50        |\n+------------+-------------------+\nCredits:\nSpecial thanks to @cak1erlizhou for contributing this question, writing the problem description and adding part of the test cases.
 * <p>
 * 中文
 * 序号: 262
 * 标题： 行程和用户
 * 链接： https://leetcode-cn.com/problems/trips-and-users
 * 描述： SQL架构\nTrips 表中存所有出租车的行程信息。每段行程有唯一键 Id，Client_Id 和 Driver_Id 是 Users 表中 Users_Id 的外键。Status 是枚举类型，枚举成员为 (‘completed’, ‘cancelled_by_driver’, ‘cancelled_by_client’)。\n+----+-----------+-----------+---------+--------------------+----------+\n| Id | Client_Id | Driver_Id | City_Id |        Status      |Request_at|\n+----+-----------+-----------+---------+--------------------+----------+\n| 1  |     1     |    10     |    1    |     completed      |2013-10-01|\n| 2  |     2     |    11     |    1    | cancelled_by_driver|2013-10-01|\n| 3  |     3     |    12     |    6    |     completed      |2013-10-01|\n| 4  |     4     |    13     |    6    | cancelled_by_client|2013-10-01|\n| 5  |     1     |    10     |    1    |     completed      |2013-10-02|\n| 6  |     2     |    11     |    6    |     completed      |2013-10-02|\n| 7  |     3     |    12     |    6    |     completed      |2013-10-02|\n| 8  |     2     |    12     |    12   |     completed      |2013-10-03|\n| 9  |     3     |    10     |    12   |     completed      |2013-10-03| \n| 10 |     4     |    13     |    12   | cancelled_by_driver|2013-10-03|\n+----+-----------+-----------+---------+--------------------+----------+\nUsers 表存所有用户。每个用户有唯一键 Users_Id。Banned 表示这个用户是否被禁止，Role 则是一个表示（‘client’, ‘driver’, ‘partner’）的枚举类型。\n+----------+--------+--------+\n| Users_Id | Banned |  Role  |\n+----------+--------+--------+\n|    1     |   No   | client |\n|    2     |   Yes  | client |\n|    3     |   No   | client |\n|    4     |   No   | client |\n|    10    |   No   | driver |\n|    11    |   No   | driver |\n|    12    |   No   | driver |\n|    13    |   No   | driver |\n+----------+--------+--------+\n写一段 SQL 语句查出 2013年10月1日 至 2013年10月3日 期间非禁止用户的取消率。基于上表，你的 SQL 语句应返回如下结果，取消率（Cancellation Rate）保留两位小数。\n+------------+-------------------+\n|     Day    | Cancellation Rate |\n+------------+-------------------+\n| 2013-10-01 |       0.33        |\n| 2013-10-02 |       0.00        |\n| 2013-10-03 |       0.50        |\n+------------+-------------------+\n致谢:\n非常感谢 @cak1erlizhou 详细的提供了这道题和相应的测试用例。
 * <p>
 * acceptance: 28.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
//# Write your MySQL query statement below