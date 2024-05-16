package Day3;

public class Array {
	
	public static void main(String args[])
	{
		  int[] numbers = {10, 20, 30, 40, 50,60,70};
	        int sum = 0;
	        
	        for (int num : numbers)
	        {
	            sum += num;
	        }
	        
	        System.out.println(sum);
	       
	        float f = sum / numbers.length;
	        
	        System.out.println("Avergae is:"+f);
	}

}
