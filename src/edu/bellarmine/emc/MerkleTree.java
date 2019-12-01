package edu.bellarmine.emc;

import TreePackage.BinaryTree;

/**
 * This class implements the recursive version of binomial coefficient calculation.
 * 
 * @author Ethan Colbert
 * @version 1.0
 * Programming Project 3
 * Fall 2019
 */

public class MerkleTree {
	
	private BinaryTree<DataHash> tree;
	
	private class DataHash {
		
		private int hashKey;
		
		public DataHash() {
			
		}
		
		public DataHash(DataBlock data) {
			hashKey = hash(data);
		}
		
		private int hash(DataBlock input) {
			
			return 0;
		}
		
	}
	
}// end "MerkleTree" class