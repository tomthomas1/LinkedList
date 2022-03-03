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
		 * We used add method to append 30 and 70 to 56 
		 *  Node with data 56 is First Created
		 *  Next Append 30 to 56
		 *  Finally Append 70 to 30
		 *  LinkedList Sequence: 56->30->70
		 */
		list.add(56);
		list.add(30);
		list.add(70);
		list.printList();
		
}
}