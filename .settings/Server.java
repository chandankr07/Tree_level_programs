package DesignPattern;

public class Server extends Computer {

	private String ram;
	
	public Server(String ram){
		this.ram=ram;}
	
	@Override
	public String getRAM() {
		return this.ram;
	}

}
