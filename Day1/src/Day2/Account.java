package Day2;

public class Account {
	
	protected int accNo;
	protected String ownerName;
	protected double balance;
	
	public void init()
	{
		accNo = 123456;
		ownerName="John C Na";
		balance = 52.53;
	}

	public void print()
	{
		System.out.println("The account number:"+accNo+"Owner name:"+ownerName+"Balance is "+balance);
		
	}
	
	public void setAcc(int acc)
	{
		accNo=acc;
	}

	public void setOwner(String s)
	{
		ownerName=s;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	
	public int getAcc1()
	{
		return accNo;
	}
	public String getOwner1()
	{
		return ownerName;
	}
	public double getBalanec1()
	{
		return balance;
	}
	
}
