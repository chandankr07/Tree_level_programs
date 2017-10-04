


/*
 * The java.util.LinkedList.push(E e) method pushes an element onto the 
 * stack represented by this list. In other words, inserts the element at the front of this list.
 *
 */

import java.util.*;

public class PushAndAddInLinkedList {

	   public static void main(String[] args) {

	   // create a LinkedList
	   LinkedList list = new LinkedList();

	   // add some elements
	   list.add("Hello");
	   list.add(2);
	   list.add("Chocolate");
	   list.add("10");

	   // print the list
	   System.out.println("LinkedList:" + list);

	   // push Element the list
	   list.push("push");
	   
	   list.add("add");

	   // print the list
	   System.out.println("LinkedList:" + list);
	   }
	}