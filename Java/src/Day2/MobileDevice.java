package Day2;

public class MobileDevice {
	
	private int id, model, price;
	private String name;
	
	void setInit()
	{
		id=10;
		model =2018;
		price=15000;
		name="Redmi ";
	}
	void getPrint()
	{
		System.out.println("Mobile device Id:"+id+"Name is :"+name+"of year is:"+model+"and rice is:"+price);
	}

}
