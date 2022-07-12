package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUse 
{
 public static void main(String args[])
 {
	 ArrayList al=new ArrayList();
	 al.add("Rohit");
	 al.add("Shraddha");
	 al.add("Vivek");
	 al.add("Rohit");
	 al.add("A");
	 al.add(null);
	 al.add("77");
	 al.add("");
	 
	 System.out.println(al);
	 System.out.println(al.size());
	 
	 System.out.println(al.indexOf("Rohit"));
	 System.out.println(al.lastIndexOf("Rohit"));
     System.out.println(al.contains("77")); 
     System.out.println(al.isEmpty());
     
    // System.out.println(al.remove(2));
	 System.out.println(al);
	 
     Iterator it= al.iterator();
    
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
     
 }
}
