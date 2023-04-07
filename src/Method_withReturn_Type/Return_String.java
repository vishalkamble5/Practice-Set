package Method_withReturn_Type;

public class Return_String
{
  public static void main(String[] args) 
  {
	System.out.println(ToUpperCase("vishal"));
	
	System.out.println("------------");
	
//	int length = StringLength("Vishal");
//	System.out.println(length);
	
	System.out.println(StringLength("Rashmi"));
	  
  }
  
  public static String ToUpperCase(String name)
  {
	    String s1 = name.toUpperCase();
	    return s1;
	  
	  
  }
  public static int StringLength(String name)
  {
	      return name.length();
	     
  }
  
}
