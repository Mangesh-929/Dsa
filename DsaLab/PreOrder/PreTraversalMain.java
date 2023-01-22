package com.treetraversal.main;


import com.treetravesal.PreTraversal;
import com.treetravesal.PreTraversal.Node;

public class PreTraversalMain {
	 public static void main(String[] args) {
			PreTraversal b = new PreTraversal();
			Node rootNode=  PreTraversal.binaryTree();
			 
		     System.out.println("Display elements in preOrder arrangement:");
		     b.preOrder(rootNode);
		     
}

}
