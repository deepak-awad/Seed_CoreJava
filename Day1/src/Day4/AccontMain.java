package Day4;

public class AccontMain {
	
	public static void main(String args[])
	{
	
	Account a1 = new Account();
	System.out.println(a1.toString());
	
	Account a2 = new Account(102,"Deep", new MyDate(05,02,2019));
	System.out.println(a2.toString());
	
	}

}
