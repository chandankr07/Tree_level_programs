package DesignPattern;

/*
 * 
 * 1. We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
 * 2. Notice that based on the input parameter, different subclass OBJECT is created and returned. getComputer is the factory method.
 *
 * use getComputer method (This is factory method ) to get object of type PC or Server
*/

public class ComputerFactory {

	public static Computer getComputer(String type, String ram){
		
		if("PC".equalsIgnoreCase(type)) 
				return new PC(ram);
		
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram);
		
		return null;
	}
}