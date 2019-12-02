package TreePackage;

import java.util.Iterator;

/**
 * This class represents a binary tree, using an array implementation.
 * 
 * @author Ethan Colbert
 * @version 1.0
 * Programming Project 3
 * Fall 2019
 */

public class MyBinaryTree<T> implements BinaryTreeInterface<T> {
	
	private T[] theData;
    private int height; // Of tree
    private int size;   // Number of locations in array for a full tree of this height
	
    /**
     * Empty-argument constructor - creates an empty tree.
     */
    public MyBinaryTree() {
    	
        height = 0;
        size = 0;
        theData = null;
    	
    }// end empty-argument constructor
    
    /**
     * Constructor - creates a full MyBinaryTree with a height of initialHeight
     * @param initialHeight - the height of the tree
     */
    public MyBinaryTree(int initialHeight) {
    	
    	this.setHeight(initialHeight);
    	this.setSize((int)Math.pow(2, initialHeight) - 1);
    	
    	// The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[size + 1]; // Unchecked cast
        theData = temp;
    	
    }// end constructor
    
    /**
     * Returns the data from the node at the index passed in.
     * @param label - the index to get data from
     * @return the data from the node referenced
     */
    public T getData(int label) {
    	return theData[label];
    }
    
    /**
     * Lets you set the data at index label
     * @param label - where to set the data at
     * @param newData - the data to set
     */
    public void setData(int label, T newData) {
    	theData[label] = newData;
    }
    
	@Override
	public T getRootData() {
		// TODO Auto-generated method stub
		return theData[1];
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public int getNumberOfNodes() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (theData == null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
		theData = null;
		height = 0;
		size = 0;
		
	}

	@Override
	public Iterator<T> getPreorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> getPostorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> getInorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> getLevelOrderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTree(T rootData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param size the size to set
	 */
	private void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param height the height to set
	 */
	private void setHeight(int height) {
		this.height = height;
	}
	
}
