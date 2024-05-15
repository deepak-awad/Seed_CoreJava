package Day3;

public class MyDate {
	
	private int dd, mm, yy;
	
	public MyDate(int d, int m, int y)
	{
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	
	public static void swap(MyDate d[])
	{
		MyDate temp=d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	
	public String toString()
	{
		return dd+"/"+yy+"/"+mm;
	}
	
	public void show()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	

}
