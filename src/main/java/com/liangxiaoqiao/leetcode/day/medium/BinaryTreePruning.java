package com.liangxiaoqiao.leetcode.day.medium;

    
    import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 814
 * title: Binary Tree Pruning
 * href: https://leetcode.com/problems/binary-tree-pruning
 * desc: We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 * (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 * Example 1:
 * Input: [1,null,0,0,1]
 * Output: [1,null,0,null,1]
 * <p>
 * Explanation:
 * Only the red nodes satisfy the property "every subtree not containing a 1".
 * The diagram on the right represents the answer.
 * Example 2:
 * Input: [1,0,1,0,0,0,1]
 * Output: [1,null,1,null,1]
 * Example 3:
 * Input: [1,1,0,1,1,0,1,0]
 * Output: [1,1,0,1,1,null,1]
 * Note:
 * The binary tree will have at most 100 nodes.
 * The value of each node will only be 0 or 1.
 * <p>
 * 中文
 * 序号: 814
 * 标题： 二叉树剪枝
 * 链接： https://leetcode-cn.com/problems/binary-tree-pruning
 * 描述： 给定二叉树根结点 root ，此外树的每个结点的值要么是 0，要么是 1。\n返回移除了所有不包含 1 的子树的原二叉树。\n( 节点 X 的子树为 X 本身，以及所有 X 的后代。)\n示例1:\n输入: [1,null,0,0,1]\n输出: [1,null,0,null,1]\n \n解释: \n只有红色节点满足条件“所有不包含 1 的子树”。\n右图为返回的答案。\n示例2:\n输入: [1,0,1,0,0,0,1]\n输出: [1,null,1,null,1]\n示例3:\n输入: [1,1,0,1,1,0,1,0]\n输出: [1,1,0,1,1,null,1]\n说明:\n给定的二叉树最多有 100 个节点。\n每个节点的值只会为 0 或 1 。
 * <p>
 * acceptance: 72.6%
 * difficulty: Medium
 * private: False
 */


//TODO init

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        return null;
    }


}
