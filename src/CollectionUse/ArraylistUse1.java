package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistUse1 {

	public static void main(String[] args) 
	{
  ArrayList al=new ArrayList();
  al.add("Rohit");
  al.add("rakesh");
  al.add("abhishek");
  al.add("priyanka");
  al.add("Neha");
  al.add("");
  al.add(9);
  al.add('a');
  al.isEmpty();
  
  
      Iterator it= al.iterator();
     while(it.hasNext())
     {
       System.out.println(it.next());
     }
	}

}
