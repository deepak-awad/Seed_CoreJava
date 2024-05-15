package Day2;

public class Customer {
	
	private int customerid;
	private String custname, city;
	
	public Customer()
	{
		customerid=10;
		custname= "John cena";
		city="Latur";
	}
	public Customer(int id, String nam, String cit )
	{
		this.customerid= id;
		this.custname=nam;
		this.city = cit;
	}
	
	public void getDisplay()
	{
		System.out.println("Customer Id:"+customerid+"Customer name:"+custname+"of city is:"+city);
	}

}
