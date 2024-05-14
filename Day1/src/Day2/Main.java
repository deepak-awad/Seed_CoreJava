package Day2;

public class Main {
	
	public static void main(String args[])
	{
		Account a = new Account();
		a.init();
		a.print();
		
		a.setAcc(12345);
		int val=a.getAcc1();
		 a.setOwner("Deep");
		 
		String s= a.getOwner1();
		 a.setBalance(1000);
		 double d = a.getBalanec1();
		 
		System.out.println(val + s + d);
		
	}


}
