package com.liangxiaoqiao.leetcode.day.medium;

    
import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 623
 * title: Add One Row to Tree
 * href: https://leetcode.com/problems/add-one-row-to-tree
 * desc: Given the root of a binary tree, then value v and depth d, you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.
 * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1, create two tree nodes with value v as N's left subtree root and right subtree root. And N's original left subtree should be the left subtree of the new left subtree root, its original right subtree should be the right subtree of the new right subtree root. If depth d is 1 that means there is no depth d-1 at all, then create a tree node with value v as the new root of the whole original tree, and the original tree is the new root's left subtree.
 * Example 1:
 * Input:
 * A binary tree as following:
 * 4
 * /   \
 * 2     6
 * / \   /
 * 3   1 5
 * <p>
 * v = 1
 * <p>
 * d = 2
 * <p>
 * Output:
 * 4
 * / \
 * 1   1
 * /     \
 * 2       6
 * / \     /
 * 3   1   5
 * Example 2:
 * Input:
 * A binary tree as following:
 * 4
 * /
 * 2
 * / \
 * 3   1
 * <p>
 * v = 1
 * <p>
 * d = 3
 * <p>
 * Output:
 * 4
 * /
 * 2
 * / \
 * 1   1
 * /     \
 * 3       1
 * Note:
 * The given d is in range [1, maximum depth of the given tree + 1].
 * The given binary tree has at least one tree node.
 * <p>
 * 中文
 * 序号: 623
 * 标题： 在二叉树中增加一行
 * 链接： https://leetcode-cn.com/problems/add-one-row-to-tree
 * 描述： 给定一个二叉树，根节点为第1层，深度为 1。在其第 d 层追加一行值为 v 的节点。
 *
 * 添加规则：给定一个深度值 d （正整数），针对深度为 d-1 层的每一非空节点 N，为 N 创建两个值为 v 的左子树和右子树。
 *
 * 将 N 原先的左子树，连接为新节点 v 的左子树；将 N 原先的右子树，连接为新节点 v 的右子树。
 *
 * 如果 d 的值为 1，深度 d - 1 不存在，则创建一个新的根节点 v，原先的整棵树将作为 v 的左子树。
 *
 * 示例 1:
 *
 * 输入:
 * 二叉树如下所示:
 *        4
 *      /   \
 *     2     6
 *    / \   /
 *   3   1 5
 *
 * v = 1
 *
 * d = 2
 *
 * 输出:
 *        4
 *       / \
 *      1   1
 *     /     \
 *    2       6
 *   / \     /
 *  3   1   5
 *
 * 示例 2:
 *
 * 输入:
 * 二叉树如下所示:
 *       4
 *      /
 *     2
 *    / \
 *   3   1
 *
 * v = 1
 *
 * d = 3
 *
 * 输出:
 *       4
 *      /
 *     2
 *    / \
 *   1   1
 *  /     \
 * 3       1
 * 注意:
 *
 * 输入的深度值 d 的范围是：[1，二叉树最大深度 + 1]。
 * 输入的二叉树至少有一个节点。
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

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        return null;
    }


}