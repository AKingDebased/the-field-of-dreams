package edu.lmu.cmsi.tree;

import java.util.ArrayList;

import edu.lmu.cmsi.tree.exception.DuplicateItemException;
import edu.lmu.cmsi.tree.exception.ItemNotFoundException;
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
		if (root == null){
			root = new BinaryTreeNode(x);
		} else if (this.contains(x)){
			throw new DuplicateItemException("argument already exists in tree");
		} 
	}

	/**
	 * Find the smallest item in the tree.
	 *
	 * @return smallest item or throws an exception if the tree is empty.
	 * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
	 *
	 */
	public int findSmallestValue() {
		if (root != null){
			return recursiveSmallestValue(root);
		} throw new ItemNotFoundException("tree must have elements");
	}

	/**
	 * Find the largest item in the tree.
	 *
	 * @return the largest item or throws an exception if the tree is empty.
	 * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
	 *
	 */
	public int findLargestValue() {
		if (root != null){
			return recursiveLargestValue(root);
		} throw new ItemNotFoundException("tree must have elements");
	}

	/**
	 * Returns whether or not the value exists in the tree
	 *
	 * @return true if the value exists, false otherwise
	 */
	public boolean contains(int value) {
		return true;
	}

	/**
	 * Returns an preorder-traversed array
	 *
	 * @return an array of Integers, or empty if the tree is empty.
	 */
	public Integer[] toPreOrder() {
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		
		recursivePreOrder(valueList, root);
		
		return valueList.toArray(new Integer[valueList.size()]);
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

	private int recursiveSmallestValue(BinaryTreeNode currentNode){
		if(currentNode.getLeft() == null){
			return currentNode.getValue();
		} else {
			return recursiveSmallestValue(currentNode.getLeft());
		}
	}

	private int recursiveLargestValue(BinaryTreeNode currentNode){
		if(currentNode.getRight() == null){
			return currentNode.getValue();
		} else {
			return recursiveSmallestValue(currentNode.getRight());
		}
	}
	
	private void recursivePreOrder(ArrayList<Integer> valueList, BinaryTreeNode currentNode){
		valueList.add(currentNode.getValue());
		
		if(currentNode.getLeft() != null){
			recursivePreOrder(valueList, currentNode.getLeft());
		}
		
		if(currentNode.getRight() != null){
			recursivePreOrder(valueList, currentNode.getRight());
		}
	}
}