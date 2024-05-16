package Day4;

public class VarArgs {
	
	public static void calculate(String s, int ...a)
	{
		int sum=0;
		for(int i =0; i<a.length;i++)
		{
			sum += a[i];
		}
		 float f = sum / a.length;
		 
		System.out.println("The name is :"+s+"The average is :"+f);
		
	}

}
