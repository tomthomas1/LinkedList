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
		 * We used add method and insertBetween to add node
		 *  Node with data 56 is First Created
		 *  Next we have Append 70 to 56
		 *  Then we have inserted 30 between 56 & 70
		 *  Final Sequence: 56->30->70
		 */
		list.add(56);
		list.add(70);
		list.printList();
		
		list.insertBetween(56, 30);
		list.printList();
		
}
}