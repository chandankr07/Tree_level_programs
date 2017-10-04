
import java.util.ArrayList;
import java.util.EmptyStackException;
	 

public class StackUsingLL <E> {
	
	 	private ArrayList<E> al;
	 
		public StackUsingLL() {
	 		al = new ArrayList<E>();
	 	}
	 
		public void push(E item) {
	 		al.add(item);
	 	}
	 
		public E pop() {
	 		if (!isEmpty())
	 			return al.remove(size()-1);
	 		else
	 			throw new EmptyStackException();
	 	}
	 
		public boolean isEmpty() {
	 		return (al.size() == 0);
	 	}
		
		public E peek() {
	 		if (!isEmpty())
	 			return al.get(size()-1);
	 		else
	 			throw new EmptyStackException();
	 	}
	 
		public int size() {
	 		return al.size();
	 	}
	 
		@Override
		public String toString() {
			return "MyStack [al=" + al.toString() + "]";
	 
	 	}
		
	    public static void main(String[] args) {
	    	StackUsingLL st = new StackUsingLL();
	        st.push(1);
	        st.push(2);
	        st.push(3);
	        st.push(4);
	        st.push(5);
	        st.push(6);
	      
	        try{
	        	System.out.println(" entries in stack : ");
	        	
	        	while(!st.isEmpty())
	        		System.out.println(st.pop());

	        	
	        }catch(EmptyStackException e){
	            System.out.println(e.getMessage());
	        }
	      
	        try{
	        st.pop();
	        }catch(EmptyStackException e){
	            System.out.println(e.getMessage());
	        }
	    }
	}

		
		
	
