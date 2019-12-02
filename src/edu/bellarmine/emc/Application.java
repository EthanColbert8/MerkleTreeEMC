package edu.bellarmine.emc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class builds the Merkle tree for a specified file.
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
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of a file to hash: ");
		String fileToHash = input.nextLine();
		
		DataReader reader = new DataReader(fileToHash);
		
		ArrayList<DataBlock> dataList = reader.readData();
		
		/* Converts the ArrayList into a DataBlock array */
		DataBlock[] temp = new DataBlock[dataList.size()];
		for (int i = 0; i < dataList.size(); i++) {
			temp[i] = dataList.get(i);
		}
		
		MerkleTree tree = new MerkleTree(temp);
		
		/* This is a level order traversal of the tree, printing out all the hashes
		 * starting with the root. */
		for (int i = 1; i <= tree.getNumberOfNodes(); i++) {
			System.out.println(tree.getData(i));
		}
		
	}// end main
	
}// end "Application" class