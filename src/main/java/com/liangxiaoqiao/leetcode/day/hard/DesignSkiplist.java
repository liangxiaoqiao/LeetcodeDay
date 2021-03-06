package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 1206
 * title: Design Skiplist
 * href: https://leetcode.com/problems/design-skiplist
 * desc: Design a Skiplist without using any built-in libraries.
 * A Skiplist is a data structure that takes O(log(n)) time to add, erase and search. Comparing with treap and red-black tree which has the same function and performance, the code length of Skiplist can be comparatively short and the idea behind Skiplists are just simple linked lists.
 * For example: we have a Skiplist containing [30,40,50,60,70,90] and we want to add 80 and 45 into it. The Skiplist works this way:
 * <p>
 * Artyom Kalinin [CC BY-SA 3.0], via Wikimedia Commons
 * You can see there are many layers in the Skiplist. Each layer is a sorted linked list. With the help of the top layers, add , erase and search can be faster than O(n). It can be proven that the average time complexity for each operation is O(log(n)) and space complexity is O(n).
 * To be specific, your design should include these functions:
 * bool search(int target) : Return whether the target exists in the Skiplist or not.
 * void add(int num): Insert a value into the SkipList.
 * bool erase(int num): Remove a value in the Skiplist. If num does not exist in the Skiplist, do nothing and return false. If there exists multiple num values, removing any one of them is fine.
 * See more about Skiplist : https://en.wikipedia.org/wiki/Skip_list
 * Note that duplicates may exist in the Skiplist, your code needs to handle this situation.
 * Example:
 * Skiplist skiplist = new Skiplist();
 * <p>
 * skiplist.add(1);
 * skiplist.add(2);
 * skiplist.add(3);
 * skiplist.search(0);   // return false.
 * skiplist.add(4);
 * skiplist.search(1);   // return true.
 * skiplist.erase(0);    // return false, 0 is not in skiplist.
 * skiplist.erase(1);    // return true.
 * skiplist.search(1);   // return false, 1 has already been erased.
 * Constraints:
 * 0 <= num, target <= 20000
 * At most 50000 calls will be made to search, add, and erase.
 * <p>
 * 中文
 * 序号: 1206
 * 标题： 设计跳表
 * 链接： https://leetcode-cn.com/problems/design-skiplist
 * 描述： 不使用任何库函数，设计一个跳表。
 * 跳表是在 O(log(n)) 时间内完成增加、删除、搜索操作的数据结构。跳表相比于树堆与红黑树，其功能与性能相当，并且跳表的代码长度相较下更短，其设计思想与链表相似。
 * 例如，一个跳表包含 [30, 40, 50, 60, 70, 90]，然后增加 80、45 到跳表中，以下图的方式操作：
 * <p>
 * Artyom Kalinin [CC BY-SA 3.0], via Wikimedia Commons
 * 跳表中有很多层，每一层是一个短的链表。在第一层的作用下，增加、删除和搜索操作的时间复杂度不超过 O(n)。跳表的每一个操作的平均时间复杂度是 O(log(n))，空间复杂度是 O(n)。
 * 在本题中，你的设计应该要包含这些函数：
 * bool search(int target) : 返回target是否存在于跳表中。
 * void add(int num): 插入一个元素到跳表。
 * bool erase(int num): 在跳表中删除一个值，如果 num 不存在，直接返回false. 如果存在多个 num ，删除其中任意一个即可。
 * 了解更多 : https://en.wikipedia.org/wiki/Skip_list
 * 注意，跳表中可能存在多个相同的值，你的代码需要处理这种情况。
 * 样例:
 * Skiplist skiplist = new Skiplist();
 * <p>
 * skiplist.add(1);
 * skiplist.add(2);
 * skiplist.add(3);
 * skiplist.search(0);   // 返回 false
 * skiplist.add(4);
 * skiplist.search(1);   // 返回 true
 * skiplist.erase(0);    // 返回 false，0 不在跳表中
 * skiplist.erase(1);    // 返回 true
 * skiplist.search(1);   // 返回 false，1 已被擦除
 * 约束条件:
 * 0 <= num, target <= 20000
 * 最多调用 50000 次 search, add, 以及 erase操作。
 * <p>
 * acceptance: 58.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
class Skiplist {
    public Skiplist() {
        
    }

    public boolean search(int target) {
        return false;
    }

    public void add(int num) {
    }

    public boolean erase(int num) {
        return false;
    }
}

/*
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */
