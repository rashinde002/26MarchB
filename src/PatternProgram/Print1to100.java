package PatternProgram;

public class Print1to100 {
	
	public static void printnumbers(int num)

	{
		if(num<=100)
		{
			System.out.println(num + " ");
			printnumbers(num+1);
		}
	}


	public static void main(String[] args) 
	{
		printnumbers(1);
	}
	
	}
