package Day5;

public class SavingAccount extends Account {
	
	protected float Balance;
	
	public SavingAccount()	
	{
		Balance=5000;
		
	}
	
	public SavingAccount(int acc, String nm, float bal) 
	{
		super(acc, nm);
		this.Balance = bal;
		
	}
	/*public String toString()
	{
		return super.toString()+" Balance is :"+Balance;
	}*/
	
	public String print()
	{
		
		return "Account no: "+accNo+" Name is: "+ name+" Balance is:"+Balance;
	}
	
	

}
