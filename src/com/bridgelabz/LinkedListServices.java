package com.bridgelabz;

/**
 * Here we are defining the methods of LinkedList
 * PROCEDURE:
 * 1. We are first adding the node to the LinkedList at the last.
 * 2. We have also created method addFirst to add node first i.e before the current node
 * 3. Then we have created the printList method to print the LinkedList  
 * 4. We have created the method insertBetween to add node between at specific location
 * 5. Method to delete the first node
 * 6. Method to delete the last element of the LinkedList
 */
public class LinkedListServices {
	Node head;
	
	/**
	 *[1] We have created the method add to add node.
	 * In this we have added the node to the last i.e it will travel in the LinkedList till the last node is null and then add the node to last.
	 * 1. First we will check if the head is null.
	 * 2. Then we have created a node as currNode and assign it to head and then we will update the current Node.
	 * 3. We will update the currNode till it is not null 
	 * 4. When reached to last node then we will assign the currNode.next as new node
	 * @param data We are passing the data here
	 */
	public void add(int data) {
		Node newNode = new Node(data);
		// if head or LinkedList is empty
		if(head == null) {
			head = newNode;
			return;
	}
	    //If LinkedList is present then from Point 2
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
	
	    currNode.next = newNode;
}

	/**
	 * [2]Method to add data at the first
	 * 1. First we will check if the head is null or LinkedList exists
	 * 2. If null then we will create the new node and assign the head to it.
	 * 3. If linkedList exists then we will point the head to newNode.next
	 * 4. And then move the head to new node. Here we are moving the head as we are adding node first 
	 * @param data : we are passing the data here
	 */
	public void addFirst(int data) {
		//creating new node
		Node newNode = new Node(data);
		// if LinkedList is empty
		if(head == null) {
			head = newNode;
			return;
		}	
		//if LinkedList exists then from point 3.
		newNode.next = head;
		head = newNode;	
	}
	
	
	/**
	 * [3]Method to print the list
	 *  1. If head is null then the LinkedList is empty
	 *  2. Here we are printing the current node data and update it. 
	 */
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		//we are not moving the head to traverse. We are assigning the currNode to head as changing the currNode
		Node currNode = head;
		//Here we are traversing till the currNode is not null and then display the data of currNode 
		while(currNode!= null) {
			System.out.print(currNode.data + " -->");
			// then we are incrementing the currNode to next
			currNode = currNode.next;
		}
		 System.out.println("NULL");
	}
	
	/**
	 * [4] Method to print the node in a specific location
	 * 1. First we pass the before node and data. The node we pass is the node before which we have to add the data.
	 * 2. Then we assign the currNode as head
	 * 3. Then we create a new node of the data
	 * 4. Then we iterate in the list till we find the before node.
	 * 5. Once we find the before node then we assign the currNode next to newNode.next
	 * 6. And currNode.next to newNode
	 * @param before : Here we will pass the node after which we have to add the new node
	 * @param data : Here we are passing the data
	 */
	public void insertBetween(int before, int data) {
		Node currNode = head;
		Node newNode = new Node(data);
		
		while(currNode.data != before) {
			currNode = currNode.next;
		}
		//assigning the newNode.next which is null to
		newNode.next = currNode.next;
		currNode.next = newNode;
		System.out.println("Inserted value " + data + " after node value " + before);
		
	}
	
	/**
	 * [5] Method to delete the first element of LinkedList
	 * Here we will change the head to next node and the first node will be removed by the garbage collector
	 * Hence we used here head.next
	 */
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		System.out.println("Successfully deleted the first node " + head.data);
		head = head.next;
	}
	
	/**
	 * [6] Method to delete the last element of the LinkedList
	 * Here we traverse through the LinkedList and make the second last next node as null.
	 * 1. First we check if the head is null
	 * 2. Second we check if there is only one node, then we make the head as null
	 * 3. Here we make the secondLast node as head and lastNode as head.next
	 * 4. And then we traverse in linkedList till the lastNode next node is not null
	 * 5. Once we get the last and secondLast node we make the secondLast.next as null
	 */
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		// Here we have used two variable secondLast and Last to traverse in the Linked List and from Point 3
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			}
		System.out.println("Successfully deleted the last node " + lastNode.data);
		secondLast.next = null;
	}
}