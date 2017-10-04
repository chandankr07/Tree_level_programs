package DesignPattern;

public class MySingleton {

	private static MySingleton INSTANCE = null;
	
	private MySingleton(){
		
		if(INSTANCE != null)
			throw new IllegalStateException("Already Instantiated");
	}
	
	public static MySingleton getInstance() {
		
		if(INSTANCE==null){

			synchronized (MySingleton.class) {
				if(INSTANCE == null) { 
					INSTANCE = new MySingleton();
				}
			}
		}
		return INSTANCE;
	}
}

/*


1) Enum

** Singleton pattern example using Java Enumj

public enum EasySingleton{
    INSTANCE;
}


*/