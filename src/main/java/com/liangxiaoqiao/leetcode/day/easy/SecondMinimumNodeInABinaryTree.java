package com.liangxiaoqiao.leetcode.day.easy;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 671
 * title: Second Minimum Node In a Binary Tree
 * href: https://leetcode.com/problems/second-minimum-node-in-a-binary-tree
 * desc: Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 * If no such second minimum value exists, output -1 instead.
 * Example 1:
 * Input:
 * 2
 * / \
 * 2   5
 * / \
 * 5   7
 * <p>
 * Output: 5
 * Explanation: The smallest value is 2, the second smallest value is 5.
 * Example 2:
 * Input:
 * 2
 * / \
 * 2   2
 * <p>
 * Output: -1
 * Explanation: The smallest value is 2, but there isn't any second smallest value.
 * <p>
 * <p>
 * 中文
 * 序号: 671
 * 标题： 二叉树中第二小的节点
 * 链接： https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree
 * 描述： 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。 \n给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。\n示例 1:\n输入: \n    2\n   / \\\n  2   5\n     / \\\n    5   7\n\n输出: 5\n说明: 最小的值是 2 ，第二小的值是 5 。\n示例 2:\n输入: \n    2\n   / \\\n  2   2\n\n输出: -1\n说明: 最小的值是 2, 但是不存在第二小的值。
 * <p>
 * acceptance: 43.1%
 * difficulty: Easy
 * private: False
 */


//TODO init

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        return 0;
    }


}