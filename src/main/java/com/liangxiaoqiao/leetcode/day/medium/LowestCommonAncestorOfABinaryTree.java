package com.liangxiaoqiao.leetcode.day.medium;

    
    import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 236
 * title: Lowest Common Ancestor of a Binary Tree
 * href: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree
 * desc: Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
 * Example 1:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 * Example 2:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 * Note:
 * All of the nodes' values will be unique.
 * p and q are different and both values will exist in the binary tree.
 * <p>
 * 中文
 * 序号: 236
 * 标题： 二叉树的最近公共祖先
 * 链接： https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
 * 描述： 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。\n百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”\n例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]\n  示例 1:\n输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1\n输出: 3\n解释: 节点 5 和节点 1 的最近公共祖先是节点 3。\n示例 2:\n输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4\n输出: 5\n解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。\n  说明:\n所有节点的值都是唯一的。\np、q 为不同节点且均存在于给定的二叉树中。
 * <p>
 * acceptance: 41.6%
 * difficulty: Medium
 * private: False
 * <p>
 * <p>
 * Definition for a binary tree node.
 * struct TreeNode {
 * int val;
 * struct TreeNode *left;
 * struct TreeNode *right;
 * };
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
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }


}