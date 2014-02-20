package com.blackmoose.pie.trees;

/***/

public class BinaryTreePreOrderTraversal {

	/*
	 * 
	 */
	public static void main(String[] args) {
		// Create the Tree ...
		Node head = null;
		
		head = new 		Node(null, null, 100);
		Node t1 = new 	Node(null,null,50);
		t1.setLeft(new 	Node(null, null, 25));
		t1.setRight(new Node(null, null, 75));
		head.setLeft(t1);
		
		Node t2 = new 	Node(null,null,150);
		t2.setLeft(new 	Node(new Node(null,null,110), null, 125));
		t2.setRight(new Node(null, null, 175));
		head.setRight(t2);
		BinaryTreePreOrderTraversal bt = new BinaryTreePreOrderTraversal();
		System.out.println("Pre Order");
		bt.preOrder(head);
		System.out.println("In Order");
		bt.inOrder(head);
		System.out.println("Post Order");
		bt.postOrder(head);
		}
	
	/*
	 * 
	 */
	public void preOrder(Node root){
		if (root == null ) return;
		System.out.println(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	/*
	 * 
	 */
	public void inOrder(Node root){
		if (root == null ) return;
		inOrder(root.getLeft());
		System.out.println(root.getValue());
		inOrder(root.getRight());
	}

	/*
	 *
	 */
	public void postOrder(Node root){
		if (root == null ) return;
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.println(root.getValue());
	}

	

}
