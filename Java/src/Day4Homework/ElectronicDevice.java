package Day4Homework;

public class ElectronicDevice {
	
	private String brand;
	
	public ElectronicDevice()
	{
		brand= "Tata";
	}
	public ElectronicDevice(String s)
	{
		this.brand = s;
		
	}
	public String toString()
	{
		return "Brand Name: "+brand;
	}
	

}
