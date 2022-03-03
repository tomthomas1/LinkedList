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
		 * We used deletFirst method to delete the first node 
		 *  Final Sequence: 30->70
		 */
		list.add(56);
		list.add(30);
		list.add(70);
		list.printList();
	
		list.deleteFirst();
		list.printList();
		
}
}