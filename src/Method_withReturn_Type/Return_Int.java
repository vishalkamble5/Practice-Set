package Method_withReturn_Type;

public class Return_Int 
{
  public static void main(String[] args) 
  {
	// int num1 = addition(10, 20);
	// System.out.println(num1); 
	          //OR
	 System.out.println(addition(10, 20));
	 
	 System.out.println("-----------");
	 
	 int num2 = addition(15, 20);
	 System.out.println(num2);
	 
	 System.out.println("-----------");
	 
	 Return_Int RI = new Return_Int();
	 // int num3 = RI.subtraction(30, 10);
	 //System.out.println(num3);
	            //OR
	 System.out.println(RI.subtraction(30, 10));
	 
  }
  
  public static int addition(int a, int b)
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
