package Day2;

public class Chair {
	
	private int id, model, price;
	private String color;
	
	public void setInit()
	{
		id=10;
		model =2018;
		price=2000;
		color="Blue ";
	}
	public void getDisplay()
	{
		System.out.println("Charir Id:"+id+"Color is :"+color+"of year is:"+model+"and rice is:"+price);
	}

}
