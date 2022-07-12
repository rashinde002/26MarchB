package PatternProgram;

public class PrintOneto100 {
	
	public static void printnumbers(int num)

	{
		if(num<=100)
		{
			System.out.print(num + " ");
			printnumbers(num+1);
		}
	}


	public static void main(String[] args) 
	{
		printnumbers(1);
	}
	
	}
