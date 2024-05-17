package Day5;

public class BankMain {

	public static void main(String args[])
	{
		SavingAccount s1 = new SavingAccount();
		System.out.println(s1.print());
		
		SavingAccount s2 = new SavingAccount(12456,"John Ceina",500000);
		System.out.println(s2.print());
		
		FixedDepostAccount f1 = new FixedDepostAccount();
		System.out.println(f1.print());
		
		FixedDepostAccount f2 = new FixedDepostAccount(78945,"testing as",562312);
		System.out.println(f2.print());
	}
}
