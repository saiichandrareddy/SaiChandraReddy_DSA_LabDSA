package pairFinder.Main;

import pairFinder.Logicc.BinarySearchTree;
import pairFinder.Logicc.BinarySearchTreePairFinder;
import pairFinder.Logicc.BinarySearchTreeTest;

public class BstTreePairFinderMain {
	public static void main(String[] args) {
		
		pairFinderTest(130);
		pairFinderTest(300);
	}
	
	static void pairFinderTest(int sum) {		
		BinarySearchTreeTest test = new BinarySearchTreeTest();
		BinarySearchTree sampleTree2 = test.sampleBinaryTree1();
		BinarySearchTreePairFinder  finder = new BinarySearchTreePairFinder (sampleTree2);
		finder.findPair(sum);
	}
}
