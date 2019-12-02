package edu.bellarmine.emc;

/**
 * This class represents a block of data, storing the data itself and its position
 * relative to the rest of the data.
 * 
 * @author Ethan Colbert
 * @version 1.0
 * Programming Project 3
 * Fall 2019
 */

public class DataBlock {
	
	private String data;//the data contained in the block
	private int position;//position relative to other blocks
	
	/**
	 * Empty-argument constructor
	 */
	public DataBlock() {
		position = -1;
		data = "";
	}// end empty-argument constructor
	
	/**
	 * Full-argument constructor - stores the data passed in.
	 * @param newData - the data to store
	 * @param nextPosition - the position of this block relative to other blocks
	 */
	public DataBlock(String newData, int nextPosition) {
		
		this.setData(newData);
		this.setPosition(nextPosition);
		
	}// end full-argument constructor
	
	/**
	 * This is a DataBlock for which position doesn't matter - it just gets set to -1.
	 * @param newData - the data to store
	 */
	public DataBlock(String newData) {
		this.setData(newData);
		position = -1;
	}// end constructor
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * @param data - the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	
	/**
	 * @param position - the position to set
	 */
	public void setPosition(int position) {
		
		if (position > 0) {
			this.position = position;
		}
		
	}

	@Override
	public String toString() {
		return "DataBlock [data = \"" + data + "\", position = " + position + "]";
	}
	
}// end "DataBlock" class