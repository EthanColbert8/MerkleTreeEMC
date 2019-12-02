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
		
		DataBlock[] temp = new DataBlock[dataList.size()];
		
		for (int i = 0; i < dataList.size(); i++) {
			temp[i] = dataList.get(i);
		}
		
		MerkleTree tree = new MerkleTree(temp);
		
		
		for (int i = 1; i <= tree.getNumberOfNodes(); i++) {
			System.out.println(tree.getData(i));
		}
		
		
	}// end main
	
}// end "Application" class