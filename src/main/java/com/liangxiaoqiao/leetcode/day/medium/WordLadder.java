package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    

/*
 * English
 * id: 127
 * title: Word Ladder
 * href: https://leetcode.com/problems/word-ladder
 * desc: Given two words (beginWord and endWord), and a dictionary\'s word list, find the length of shortest transformation sequence from beginWord to endWord, such that:\nOnly one letter can be changed at a time.\nEach transformed word must exist in the word list. Note that beginWord is not a transformed word.\nNote:\nReturn 0 if there is no such transformation sequence.\nAll words have the same length.\nAll words contain only lowercase alphabetic characters.\nYou may assume no duplicates in the word list.\nYou may assume beginWord and endWord are non-empty and are not the same.\nExample 1:\nInput:\nbeginWord = \"hit\",\nendWord = \"cog\",\nwordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]\n\nOutput: 5\n\nExplanation: As one shortest transformation is \"hit\" -> \"hot\" -> \"dot\" -> \"dog\" -> \"cog\",\nreturn its length 5.\nExample 2:\nInput:\nbeginWord = \"hit\"\nendWord = \"cog\"\nwordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\"]\n\nOutput: 0\n\nExplanation: The endWord \"cog\" is not in wordList, therefore no possible transformation.
 * <p>
 * 中文
 * 序号: 127
 * 标题： 单词接龙
 * 链接： https://leetcode-cn.com/problems/word-ladder
 * 描述： 给定两个单词（beginWord 和 endWord）和一个字典 wordList，找出所有从 beginWord 到 endWord 的最短转换序列。转换需遵循如下规则：\n每次转换只能改变一个字母。\n转换过程中的中间单词必须是字典中的单词。\n说明:\n如果不存在这样的转换序列，返回一个空列表。\n所有单词具有相同的长度。\n所有单词只由小写字母组成。\n字典中不存在重复的单词。\n你可以假设 beginWord 和 endWord 是非空的，且二者不相同。\n示例 1:\n输入:\nbeginWord = \"hit\",\nendWord = \"cog\",\nwordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]\n\n输出:\n[\n  [\"hit\",\"hot\",\"dot\",\"dog\",\"cog\"],\n  [\"hit\",\"hot\",\"lot\",\"log\",\"cog\"]\n]\n示例 2:\n输入:\nbeginWord = \"hit\"\nendWord = \"cog\"\nwordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\"]\n\n输出: []\n\n解释: endWord \"cog\" 不在字典中，所以不存在符合要求的转换序列。
 * <p>
 * acceptance: 26.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return 0;
    }
}