package Method_withReturn_Type;

public class Sample2 
{
   public static void main (String[]args)
   {
	   String S2 = convertStringToUpperCase("vishal"); 
	   System.out.println(S2);
	   
   }
   public static String convertStringToUpperCase(String name)
   {
	  String s1 = name.toUpperCase();
	  return s1;
   }
   
}
