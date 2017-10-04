import java.util.*;  


public class LinkedListUse{  
 public static void main(String args[]){  
  
  LinkedList<String> ll=new LinkedList<String>();  
  
  ll.add("Ravi");  
  ll.add("Vijay");  
  ll.add("Ravi");  
  ll.add("Ajay");  
  ll.add("Chandan");
  ll.add("kumar");
  ll.add("singh");
  ll.add("chauhan");
  
  
  for(String obj:ll)
  System.out.println(obj);
  
  
  ll.remove(ll.get(0));
  
  ll.removeLast();
  ll.removeFirst();
  ll.addLast("chauhan!");
  
  System.out.println("\nAfter :\n");
  
  for(String obj:ll)
	  System.out.println(obj);
	  
  System.out.println("\n"+ ll.contains("Chaan"));
  
  System.out.println("\n"+ ll.getLast());
  
 }  
}  