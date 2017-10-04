package DesignPattern;

public class PC extends Computer {

	private String ram;
	
	public PC(String ram){
		this.ram=ram;
	}
	
	@Override
	public String getRAM() {
		return this.ram;
	}

}