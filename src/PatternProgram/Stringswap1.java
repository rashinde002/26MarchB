package PatternProgram;

public class Stringswap1 {

	public static void main(String[] args) 
	{
    String s = "Nehru";
    String t = "Montessori";
    
    
    System.out.println("Before Swapping");
	System.out.println(s);
	System.out.println(t);
    //1. append s and t
    
    s=s+t;
    
    //2. store initial string s in string t
       t=s.substring(0, s.length()-t.length());
    
    //3. store initial string t in string s
    s=s.substring(t.length());
	
	System.out.println("After Swapping");
	System.out.println(s);
	System.out.println(t);
	}

}
