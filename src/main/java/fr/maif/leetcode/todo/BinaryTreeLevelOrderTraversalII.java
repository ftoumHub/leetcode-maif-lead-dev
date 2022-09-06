package fr.maif.leetcode.todo;

import java.util.ArrayList;

import fr.maif.leetcode.commons.TreeNode;

/**
 * Given a binary tree, return the bottom-up level order traversal of its
 * nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * <p>
 * Given binary tree {3,9,20,#,#,15,7},
 * 
 * <pre>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 * 
 * return its bottom-up level order traversal as:
 * 
 * <pre>
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class BinaryTreeLevelOrderTraversalII {

  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    if (root == null) {
      return list;
    }
    ArrayList<TreeNode> current = new ArrayList<TreeNode>();
    current.add(root);
    list.add(toInteger(current));
    while (!current.isEmpty()) {
      ArrayList<TreeNode> next = new ArrayList<TreeNode>();
      while (!current.isEmpty()) {
        TreeNode x = current.remove(0);
        if (x.left != null) {
          next.add(x.left);
        }
        if (x.right != null) {
          next.add(x.right);
        }
      }
      if (!next.isEmpty()) {
        list.add(toInteger(next));
      }
      current = next;
    }
    return list;
  }

  public ArrayList<Integer> toInteger(ArrayList<TreeNode> list) {
    ArrayList<Integer> ilist = new ArrayList<Integer>();
    for (TreeNode t : list) {
      ilist.add(t.val);
    }
    return ilist;
  }
}
