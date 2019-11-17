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
	
	private String data;
	private int position;
	
	/**
	 * Empty-argument constructor
	 */
	public DataBlock() {
		position = -1;
		data = "";
	}// end empty-argument constructor
	
	public DataBlock(String newData, int nextPosition) {
		
		this.setData(newData);
		this.setPosition(nextPosition);
		
	}
	
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
		
		if (position >= 0) {
			this.position = position;
		}
		
	}
	
}// end "DataBlock" class