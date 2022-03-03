package com.bridgelabz;

public class LinkedList {
   Node head;
	
   /**
    * Main method for LinkedList
    * We are calling the methods in the main function
    */
	public static void main(String[] args) {
		
		LinkedListServices list = new LinkedListServices(); 
		/**
		 * Here we are calling the add method to add node
		 * We used findNode method search for specific node 
		 *  
		 */
		list.add(56);
		list.add(30);
		list.add(70);
		list.printList();
	
		list.findNode(30);
		list.findNode(80);
		
		
}
}