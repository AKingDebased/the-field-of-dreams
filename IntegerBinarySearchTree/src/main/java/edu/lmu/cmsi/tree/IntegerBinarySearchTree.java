package edu.lmu.cmsi.tree;

import edu.lmu.cmsi.tree.node.BinaryTreeNode;

public class IntegerBinarySearchTree {

  protected BinaryTreeNode root;

  public IntegerBinarySearchTree() {
    this.root = null;
  }

  /**
   * Insert into the tree.
   *
   * @param x the item to insert.
   * @throws edu.lmu.cmsi.tree.exception.DuplicateItemException if x exists.
   */
  public void insert(int x) {
    throw new UnsupportedOperationException("Insert needs to be implemented");
  }

  /**
   * Find the smallest item in the tree.
   *
   * @return smallest item or throws an exception if the tree is empty.
   * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
   *
   */
  public int findSmallestValue() {
    throw new UnsupportedOperationException("findSmallestValue needs to be implemented");
  }

  /**
   * Find the largest item in the tree.
   *
   * @return the largest item or throws an exception if the tree is empty.
   * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
   *
   */
  public int findLargestValue() {
    throw new UnsupportedOperationException("findLargestValue needs to be implemented");
  }

  /**
   * Returns whether or not the value exists in the tree
   *
   * @return true if the value exists, false otherwise
   */
  public boolean contains(int value) {
    throw new UnsupportedOperationException("contains needs to be implemented");
  }

  /**
   * Returns an preorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toPreOrder() {
    throw new UnsupportedOperationException("toPreOrder needs to be implemented");
  }

  /**
   * Returns an inorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toInOrder() {
    throw new UnsupportedOperationException("toInOrder needs to be implemented");
  }

  /**
   * Returns an postorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toPostOrder() {
    throw new UnsupportedOperationException("toPostOrder needs to be implemented");
  }

  /**
   * Returns an Breadth First-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toBreadthFirstOrder() {
    throw new UnsupportedOperationException("toBreadthFirstOrder needs to be implemented");
  }
}