package com.treetravesal;



public class PreTraversal {
	
	Node root;
	public static class Node {
		int key;
		Node left;
		Node right;
		
		public Node(int key) {
			this.key = key;
			}
 }
	 public void preOrder(Node node1) {
		 if(node1!=null) {
			 System.out.print("  "+node1.key);
			preOrder(node1.left) ;
			preOrder(node1.right);
		
		 }
	 }
	 public static Node binaryTree() {
		 Node rootNode=new Node(6);
		 Node node3= new Node(3);
		 Node node4= new Node(4);
		 Node node5= new Node(5);
		 Node node7= new Node(7);
		 Node node8= new Node(8);
		 Node node9= new Node(9);
		 rootNode.left=node4;
		 rootNode.right=node8;
		 node4.left=node3;
		 node4.right=node5;
		 node8.left=node7;
		 node8.right=node9;
		 return rootNode;
		 }
	 

}
