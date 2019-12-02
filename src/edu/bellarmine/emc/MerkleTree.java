package edu.bellarmine.emc;

import java.security.MessageDigest;
import TreePackage.MyBinaryTree;

/**
 * This class implements the recursive version of binomial coefficient calculation.
 * 
 * @author Ethan Colbert
 * @version 1.0
 * Programming Project 3
 * Fall 2019
 */

public class MerkleTree {
	
	private MyBinaryTree<DataHash> tree;
	private int height;
	
	public MerkleTree() {
		tree = new MyBinaryTree<DataHash>();
		height = 0;
		//size = 0;
	}
	
	public MerkleTree(DataBlock[] input) {
		
		height = (int)Math.ceil(Math.log(input.length + 1) / Math.log(2));
		//size = input.length;
		
		tree = new MyBinaryTree<DataHash>(height);
		
		for (int i = 1; i <= tree.getNumberOfNodes(); i++) {
			tree.setData(i, new DataHash());
		}
		
		computeHashes(input);
		
	}
	
	private void computeHashes(DataBlock[] input) {
		
		for (int i = height; i >= 1; i--) {
			
			if (i == height) {
				for (int j = (int)Math.pow(2, i - 1); j < (int)Math.pow(2, i); j++) {
					tree.setData(j, new DataHash(input[j - (int)Math.pow(2, i - 1)]));
					//System.out.println(tree.getData(j).getHashKey());
				}
			}
			else {
				for (int j = (int)Math.pow(2, i - 1); j < (int)Math.pow(2, i); j++) {
					tree.setData(j, new DataHash(new DataBlock(Integer.toString(tree.getData(j*2).getHashKey()) + Integer.toString(tree.getData(j*2).getHashKey()))));
					//System.out.println(tree.getData(j).getHashKey());
				}
			}
			
		}
		
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getNumberOfNodes() {
		return (int)Math.pow(2, height) - 1;
	}
	
	public int getData(int index) {
		return tree.getData(index).getHashKey();
	}
	
	private class DataHash {
		
		private int hashKey;
		
		public DataHash() {
			hashKey = -1;
		}
		
		public DataHash(DataBlock data) {
			hashKey = hash(data);
		}
		
		private int hash(DataBlock input) {
			
			int result = 0;
			
			try {
				MessageDigest encoder = MessageDigest.getInstance("SHA-256");
				byte[] bytesOfHash = encoder.digest(input.getData().getBytes());
				
				for (byte n : bytesOfHash) {
					result += n;
				}
			}
			catch(Exception e) {
				
			}
			
			return result;
		}
		
		public int getHashKey() {
			return hashKey;
		}
		
	}
	
}// end "MerkleTree" class