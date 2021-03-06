package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 726
 * title: Number of Atoms
 * href: https://leetcode.com/problems/number-of-atoms
 * desc: Given a chemical formula (given as a string), return the count of each atom.
 * An atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.
 * 1 or more digits representing the count of that element may follow if the count is greater than 1. If the count is 1, no digits will follow. For example, H2O and H2O2 are possible, but H1O2 is impossible.
 * Two formulas concatenated together produce another formula. For example, H2O2He3Mg4 is also a formula.
 * A formula placed in parentheses, and a count (optionally added) is also a formula. For example, (H2O2) and (H2O2)3 are formulas.
 * Given a formula, output the count of all elements as a string in the following form: the first name (in sorted order), followed by its count (if that count is more than 1), followed by the second name (in sorted order), followed by its count (if that count is more than 1), and so on.
 * Example 1:
 * Input:
 * formula = "H2O"
 * Output: "H2O"
 * Explanation:
 * The count of elements are {'H': 2, 'O': 1}.
 * Example 2:
 * Input:
 * formula = "Mg(OH)2"
 * Output: "H2MgO2"
 * Explanation:
 * The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.
 * Example 3:
 * Input:
 * formula = "K4(ON(SO3)2)2"
 * Output: "K4N2O14S4"
 * Explanation:
 * The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.
 * Note:
 * All atom names consist of lowercase letters, except for the first character which is uppercase.
 * The length of formula will be in the range [1, 1000].
 * formula will only consist of letters, digits, and round parentheses, and is a valid formula as defined in the problem.
 * <p>
 * 中文
 * 序号: 726
 * 标题： 原子的数量
 * 链接： https://leetcode-cn.com/problems/number-of-atoms
 * 描述： 给定一个化学式formula（作为字符串），返回每种原子的数量。\n原子总是以一个大写字母开始，接着跟随0个或任意个小写字母，表示原子的名字。\n如果数量大于 1，原子后会跟着数字表示原子的数量。如果数量等于 1 则不会跟数字。例如，H2O 和 H2O2 是可行的，但 H1O2 这个表达是不可行的。\n两个化学式连在一起是新的化学式。例如 H2O2He3Mg4 也是化学式。\n一个括号中的化学式和数字（可选择性添加）也是化学式。例如 (H2O2) 和 (H2O2)3 是化学式。\n给定一个化学式，输出所有原子的数量。格式为：第一个（按字典序）原子的名子，跟着它的数量（如果数量大于 1），然后是第二个原子的名字（按字典序），跟着它的数量（如果数量大于 1），以此类推。\n示例 1:\n输入: \nformula = \"H2O\"\n输出: \"H2O\"\n解释: \n原子的数量是 {\'H\': 2, \'O\': 1}。\n示例 2:\n输入: \nformula = \"Mg(OH)2\"\n输出: \"H2MgO2\"\n解释: \n原子的数量是 {\'H\': 2, \'Mg\': 1, \'O\': 2}。\n示例 3:\n输入: \nformula = \"K4(ON(SO3)2)2\"\n输出: \"K4N2O14S4\"\n解释: \n原子的数量是 {\'K\': 4, \'N\': 2, \'O\': 14, \'S\': 4}。\n注意:\n所有原子的第一个字母为大写，剩余字母都是小写。\nformula的长度在[1, 1000]之间。\nformula只包含字母、数字和圆括号，并且题目中给定的是合法的化学式。
 * <p>
 * acceptance: 46.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class NumberOfAtoms {
    public String countOfAtoms(String formula) {
        return null;
    }
}