package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 529
 * title: Minesweeper
 * href: https://leetcode.com/problems/minesweeper
 * desc: Let\'s play the minesweeper game (Wikipedia, online game)!\nYou are given a 2D char matrix representing the game board. \'M\' represents an unrevealed mine, \'E\' represents an unrevealed empty square, \'B\' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit (\'1\' to \'8\') represents how many mines are adjacent to this revealed square, and finally \'X\' represents a revealed mine.\nNow given the next click position (row and column indices) among all the unrevealed squares (\'M\' or \'E\'), return the board after revealing this position according to the following rules:\nIf a mine (\'M\') is revealed, then the game is over - change it to \'X\'.\nIf an empty square (\'E\') with no adjacent mines is revealed, then change it to revealed blank (\'B\') and all of its adjacent unrevealed squares should be revealed recursively.\nIf an empty square (\'E\') with at least one adjacent mine is revealed, then change it to a digit (\'1\' to \'8\') representing the number of adjacent mines.\nReturn the board when no more squares will be revealed.\n  Example 1:\nInput: \n\n[[\'E\', \'E\', \'E\', \'E\', \'E\'],\n [\'E\', \'E\', \'M\', \'E\', \'E\'],\n [\'E\', \'E\', \'E\', \'E\', \'E\'],\n [\'E\', \'E\', \'E\', \'E\', \'E\']]\n\nClick : [3,0]\n\nOutput: \n\n[[\'B\', \'1\', \'E\', \'1\', \'B\'],\n [\'B\', \'1\', \'M\', \'1\', \'B\'],\n [\'B\', \'1\', \'1\', \'1\', \'B\'],\n [\'B\', \'B\', \'B\', \'B\', \'B\']]\n\nExplanation:\nExample 2:\nInput: \n\n[[\'B\', \'1\', \'E\', \'1\', \'B\'],\n [\'B\', \'1\', \'M\', \'1\', \'B\'],\n [\'B\', \'1\', \'1\', \'1\', \'B\'],\n [\'B\', \'B\', \'B\', \'B\', \'B\']]\n\nClick : [1,2]\n\nOutput: \n\n[[\'B\', \'1\', \'E\', \'1\', \'B\'],\n [\'B\', \'1\', \'X\', \'1\', \'B\'],\n [\'B\', \'1\', \'1\', \'1\', \'B\'],\n [\'B\', \'B\', \'B\', \'B\', \'B\']]\n\nExplanation:\n  Note:\nThe range of the input matrix\'s height and width is [1,50].\nThe click position will only be an unrevealed square (\'M\' or \'E\'), which also means the input board contains at least one clickable square.\nThe input board won\'t be a stage when game is over (some mines have been revealed).\nFor simplicity, not mentioned rules should be ignored in this problem. For example, you don\'t need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.
 * <p>
 * 中文
 * 序号: 529
 * 标题： 扫雷游戏
 * 链接： https://leetcode-cn.com/problems/minesweeper
 * 描述： 让我们一起来玩扫雷游戏！\n给定一个代表游戏板的二维字符矩阵。 \'M\' 代表一个未挖出的地雷，\'E\' 代表一个未挖出的空方块，\'B\' 代表没有相邻（上，下，左，右，和所有4个对角线）地雷的已挖出的空白方块，数字（\'1\' 到 \'8\'）表示有多少地雷与这块已挖出的方块相邻，\'X\' 则表示一个已挖出的地雷。\n现在给出在所有未挖出的方块中（\'M\'或者\'E\'）的下一个点击位置（行和列索引），根据以下规则，返回相应位置被点击后对应的面板：\n如果一个地雷（\'M\'）被挖出，游戏就结束了- 把它改为 \'X\'。\n如果一个没有相邻地雷的空方块（\'E\'）被挖出，修改它为（\'B\'），并且所有和其相邻的方块都应该被递归地揭露。\n如果一个至少与一个地雷相邻的空方块（\'E\'）被挖出，修改它为数字（\'1\'到\'8\'），表示相邻地雷的数量。\n如果在此次点击中，若无更多方块可被揭露，则返回面板。\n  示例 1：\n输入: \n\n[[\'E\', \'E\', \'E\', \'E\', \'E\'],\n [\'E\', \'E\', \'M\', \'E\', \'E\'],\n [\'E\', \'E\', \'E\', \'E\', \'E\'],\n [\'E\', \'E\', \'E\', \'E\', \'E\']]\n\nClick : [3,0]\n\n输出: \n\n[[\'B\', \'1\', \'E\', \'1\', \'B\'],\n [\'B\', \'1\', \'M\', \'1\', \'B\'],\n [\'B\', \'1\', \'1\', \'1\', \'B\'],\n [\'B\', \'B\', \'B\', \'B\', \'B\']]\n\n解释:\n示例 2：\n输入: \n\n[[\'B\', \'1\', \'E\', \'1\', \'B\'],\n [\'B\', \'1\', \'M\', \'1\', \'B\'],\n [\'B\', \'1\', \'1\', \'1\', \'B\'],\n [\'B\', \'B\', \'B\', \'B\', \'B\']]\n\nClick : [1,2]\n\n输出: \n\n[[\'B\', \'1\', \'E\', \'1\', \'B\'],\n [\'B\', \'1\', \'X\', \'1\', \'B\'],\n [\'B\', \'1\', \'1\', \'1\', \'B\'],\n [\'B\', \'B\', \'B\', \'B\', \'B\']]\n\n解释:\n  注意：\n输入矩阵的宽和高的范围为 [1,50]。\n点击的位置只能是未被挖出的方块 (\'M\' 或者 \'E\')，这也意味着面板至少包含一个可点击的方块。\n输入面板不会是游戏结束的状态（即有地雷已被挖出）。\n简单起见，未提及的规则在这个问题中可被忽略。例如，当游戏结束时你不需要挖出所有地雷，考虑所有你可能赢得游戏或标记方块的情况。
 * <p>
 * acceptance: 56.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class Minesweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        return null;
    }
}