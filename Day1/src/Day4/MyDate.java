package Day4;

public class MyDate {
	
	private int dd, mm, yy;
	
	public MyDate()
	{
		dd=10;
		mm=01;
		yy=2012;
	}
	public MyDate(int d, int m, int y)
	{
		this.dd = d;
		this.mm = m;
		this.yy = y;
		
	}
	public String toString()
	{
		return dd+"/"+yy+"/"+mm;
	}

}
