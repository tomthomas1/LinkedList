package com.bridgelabz;

/**
 * Created a class Node to store the data and the next
 */
public class Node {
	int data;
	Node next;
	
	/**
	 * Constructor
	 * We have taken next as null because when the new node is created we are taking the next node as null
	 * @param data : data will be passed
	 */
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
