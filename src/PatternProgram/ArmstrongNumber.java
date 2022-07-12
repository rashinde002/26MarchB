package PatternProgram;

public class ArmstrongNumber {

	public static void arm(int num)
	{
	int cube = 0;
	int r;
	int t;
	t=num;
	while(num>0)
	{
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);	}
	if(t==cube)
	{
		System.out.println("This is a Armstrong Number");
	}
	else
	{
		System.out.println("This is not an Armstrong Number");
	}
	}
	public static void main(String[] args) 
	{
        arm(370);
	}
}
