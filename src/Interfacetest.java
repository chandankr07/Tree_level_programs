	
	interface Printable{  
		void print();  
	}  
	
	interface Showable extends Printable{  
		void show();  
	}  
	
	class Interfacetest implements Showable{  
		public void print(){
				System.out.println("Hello");
			}  
		public void show(){
				System.out.println("Welcome");
			}  
	  
		public static void main(String args[]){  
		
		Interfacetest obj = new Interfacetest();  
			obj.print();  
			obj.show();  
	 }  
	}
	/*
	 * An interface that have no member is known as marker or tagged interface. For example: Serializable, Cloneable, Remote etc. 
	 * They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
	 * 
	 
	 Marker interface in Java e.g. Serializable, Clonnable and Remote is used to indicate something to compiler or JVM that the class implementing 
	 any of these would have some special behavior. Hence, if the JVM sees a Class is implementing the Serializable interface it does some special operation 
	 on it and writes the state of the object into object stream. This object stream is then available to be read by another JVM. Similarly if JVM finds that a 
	 class is implementing Clonnable interface, it performs some special operation in order to support cloning. The same theory goes for RMI and Remote interface. 
	 This indication (to the JVM) can also be done using a boolean flag or a String variable inside the class.
	 
	 In short a marker interface in Java is used to indicate something to compiler, JVM or any other tool but Annotation is better way of doing same thing.
	 
	 
	 Abstract class																	Interface
1) Abstract class can have abstract and non-abstract methods.						Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.								Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.		Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.						Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.							The interface keyword is used to declare interface.

6) Example:
public abstract class Shape{
	public abstract void draw();
}	

Interface :-
Example:

public interface Drawable{
	void draw();
}
	 
	 
	 
	//How Serializable interface is written?  
	
	public interface Serializable{  
	}
	
	
	
	
	*/