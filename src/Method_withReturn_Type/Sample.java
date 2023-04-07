package Method_withReturn_Type;

public class Sample 
{
  
public static void main(String[] args)
  {
	 int s1 = addition(10, 5);
	 System.out.println(s1);
	 int s2 = addition(20, 21);
	 System.out.println(s2);
	 System.out.println(addition(10, 20));
	 Sample Smp = new Sample();
	 int s3 = Smp.subtraction(35, 22);
	 System.out.println(s3);
  }
   public static int addition(int a,int b)
   {
	    int sum = a+b; 
	    return sum;
   }
   public int subtraction(int c,int d)
   {
	  int sub = c-d;
	  return sub;
   }
}
