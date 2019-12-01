package edu.bellarmine.emc;

import java.util.ArrayList;

/**
 * This class implements the recursive version of binomial coefficient calculation.
 * 
 * @author Ethan Colbert
 * @version 1.0
 * Programming Project 3
 * Fall 2019
 */

public class Application {
	
	/**
	 * Execution starts here.
	 * @param args
	 */
	public static void main(String[] args) {
		
		DataReader reader = new DataReader("TestFile.txt");
		
		ArrayList<DataBlock> dataList = reader.readData();
		
		for (DataBlock n : dataList) {
			System.out.println(n.toString());
		}
		
	}// end main
	
}// end "Application" class