package PatternProgram;

public class Addition {

	public static void main(String[] args) 
	{
	 int Add(int x, int y)
	{
		//Iterate till there is no carry
		
		while(y !=0)
		{
			//carry now contains common
			//set bits of x and y
			
			int carry = x & y;
		     x = x^y;
		     y=carry<<1;
		     
		}
		
		return;
	}
	System.out.println(Add(14, 12));
	}

}
