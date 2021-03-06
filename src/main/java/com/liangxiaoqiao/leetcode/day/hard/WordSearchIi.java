package com.liangxiaoqiao.leetcode.day.hard;

import java.util.List;

/*
 * English
 * id: 212
 * title: Word Search II
 * href: https://leetcode.com/problems/word-search-ii
 * desc: Given a 2D board and a list of words from the dictionary, find all words in the board.\nEach word must be constructed from letters of sequentially adjacent cell, where \"adjacent\" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.\nExample:\nInput: \nwords = [\"oath\",\"pea\",\"eat\",\"rain\"] and board =\n[\n  [\'o\',\'a\',\'a\',\'n\'],\n  [\'e\',\'t\',\'a\',\'e\'],\n  [\'i\',\'h\',\'k\',\'r\'],\n  [\'i\',\'f\',\'l\',\'v\']\n]\n\nOutput: [\"eat\",\"oath\"]\nNote:\nYou may assume that all inputs are consist of lowercase letters a-z.
 * <p>
 * 中文
 * 序号: 212
 * 标题： 单词搜索 II
 * 链接： https://leetcode-cn.com/problems/word-search-ii
 * 描述： 给定一个二维网格 board 和一个字典中的单词列表 words，找出所有同时在二维网格和字典中出现的单词。\n单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。\n示例:\n输入: \nwords = [\"oath\",\"pea\",\"eat\",\"rain\"] and board =\n[\n  [\'o\',\'a\',\'a\',\'n\'],\n  [\'e\',\'t\',\'a\',\'e\'],\n  [\'i\',\'h\',\'k\',\'r\'],\n  [\'i\',\'f\',\'l\',\'v\']\n]\n\n输出: [\"eat\",\"oath\"]\n说明:\n你可以假设所有输入都由小写字母 a-z 组成。\n提示:\n你需要优化回溯算法以通过更大数据量的测试。你能否早点停止回溯？\n如果当前单词不存在于所有单词的前缀中，则可以立即停止回溯。什么样的数据结构可以有效地执行这样的操作？散列表是否可行？为什么？ 前缀树如何？如果你想学习如何实现一个基本的前缀树，请先查看这个问题： 实现Trie（前缀树）。
 * <p>
 * acceptance: 31.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class WordSearchIi {
    public List<String> findWords(char[][] board, String[] words) {
        return null;
    }
}

