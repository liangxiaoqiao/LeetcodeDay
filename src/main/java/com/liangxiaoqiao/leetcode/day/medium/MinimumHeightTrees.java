package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 310
 * title: Minimum Height Trees
 * href: https://leetcode.com/problems/minimum-height-trees
 * desc: For an undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). Given such a graph, write a function to find all the MHTs and return a list of their root labels.
 * Format
 * The graph contains n nodes which are labeled from 0 to n - 1. You will be given the number n and a list of undirected edges (each edge is a pair of labels).
 * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * Example 1 :
 * Input: n = 4, edges = [[1, 0], [1, 2], [1, 3]]
 * <p>
 * 0
 * |
 * 1
 * / \
 * 2   3
 * <p>
 * Output: [1]
 * Example 2 :
 * Input: n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]
 * <p>
 * 0  1  2
 * \ | /
 * 3
 * |
 * 4
 * |
 * 5
 * <p>
 * Output: [3, 4]
 * Note:
 * According to the definition of tree on Wikipedia: “a tree is an undirected graph in which any two vertices are connected by exactly one path. In other words, any connected graph without simple cycles is a tree.”
 * The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.
 * <p>
 * 中文
 * 序号: 310
 * 标题： 最小高度树
 * 链接： https://leetcode-cn.com/problems/minimum-height-trees
 * 描述： 对于一个具有树特征的无向图，我们可选择任何一个节点作为根。图因此可以成为树，在所有可能的树中，具有最小高度的树被称为最小高度树。给出这样的一个图，写出一个函数找到所有的最小高度树并返回他们的根节点。\n格式\n该图包含 n 个节点，标记为 0 到 n - 1。给定数字 n 和一个无向边 edges 列表（每一个边都是一对标签）。\n你可以假设没有重复的边会出现在 edges 中。由于所有的边都是无向边， [0, 1]和 [1, 0] 是相同的，因此不会同时出现在 edges 里。\n示例 1:\n输入: n = 4, edges = [[1, 0], [1, 2], [1, 3]]\n\n        0\n        |\n        1\n       / \\\n      2   3 \n\n输出: [1]\n示例 2:\n输入: n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]\n\n     0  1  2\n      \\ | /\n        3\n        |\n        4\n        |\n        5 \n\n输出: [3, 4]\n说明:\n 根据树的定义，树是一个无向图，其中任何两个顶点只通过一条路径连接。 换句话说，一个任何没有简单环路的连通图都是一棵树。\n树的高度是指根节点和叶子节点之间最长向下路径上边的数量。
 * <p>
 * acceptance: 31.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        return null;
    }
}

