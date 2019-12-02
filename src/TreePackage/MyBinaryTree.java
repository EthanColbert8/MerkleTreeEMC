/**
 * 
 */
package TreePackage;

import java.util.Iterator;

/**
 * @author Ethan Colbert
 *
 */
public class MyBinaryTree<T> implements BinaryTreeInterface<T> {
	
	private T[] theData;
    private int height; // Of tree
    private int size;   // Number of locations in array for a full tree of this height
	
    public MyBinaryTree() {
    	
        height = 0;
        size = 0;
        theData = null;
    	
    }
    
    public MyBinaryTree(int initialHeight) {
    	
    	this.setHeight(initialHeight);
    	this.setSize((int)Math.pow(2, initialHeight) - 1);
    	
    	// The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[size + 1]; // Unchecked cast
        theData = temp;
    	
    }
    
    public T getData(int label) {
    	return theData[label];
    }
    
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
