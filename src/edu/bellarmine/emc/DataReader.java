package edu.bellarmine.emc;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class reads the data from the file and breaks it up into DataBlocks.
 * 
 * @author Ethan Colbert
 * @version 1.0
 * Programming Project 3
 * Fall 2019
 */

public class DataReader {
	
	private Scanner fileRead;//a Scanner that reads the file
	private File file;//a File object for the file itself
	
	/**
	 * Empty-argument constructor
	 */
	public DataReader() {
		
	}// end empty-argument constructor
	
	/**
	 * Full-argument constructor - creates a DataReader for the file passed in.
	 * @param fileName -the name of the file to read from
	 */
	public DataReader(String fileName) {
		file = new File(fileName);
	}// end full-argument constructor
	
	/**
	 * Breaks the data in the file into DataBlocks, with one block for each line of data.
	 * @return an ArrayList containing all the DataBlocks
	 */
	public ArrayList<DataBlock> readData() {
		
		ArrayList<DataBlock> currentList = new ArrayList<DataBlock>(0);
		int position = 1;
		
		try {
			fileRead = new Scanner(file);
			
			while (fileRead.hasNextLine()) {
				currentList.add(new DataBlock(fileRead.nextLine(), position));
				position++;
			}
			
			fileRead.close();
		}
		catch(Exception e) {
			//System.out.println("Couldn't read from file. File may be corrupt.");
		}
		
		return currentList;
	}// end "readData" method

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}
	
	/**
	 * @param fileName - the name of the new file
	 */
	public void setFile(String fileName) {
		file = new File(fileName);
	}
	
}// end "DataReader" class