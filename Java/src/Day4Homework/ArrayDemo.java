package Day4Homework;

public class ArrayDemo {
	
	public static void calculate(int ...a)
	{
		for (int i : a)
		{
			System.out.println(i);
		}
		
	}
	
	public static void floata(float ...f)
	{
		for (float v : f)
		{
			System.out.println(v);
		}
		
	}
	
	public static void main(String args[])
	{
	
	ArrayDemo.calculate(10,20,30,40,50,60,70,80,90,100);
	ArrayDemo.floata(10.10f,20.20f,30.30f,40.40f,50.50f);
	
	int numbers[] = {100,200,300,400,500,600,700,800,900,1000};
	
	for(int i1 :numbers)
	{
		System.out.println(i1);
	}
	
	}

}
