package method_types;

public class With_parameter1 
{
	public static void main(String[]args)
	{
		m1(12,15);
		System.out.println("----- ");
		Sample_2.m3(7, 8);
		System.out.println("------");
		With_parameter1 M=new With_parameter1();
		M.m1(20, 15);
		System.out.println("-------");
		Sample_2 M1 =new Sample_2();
		M1.m4(30, 3);
		System.out.println("---------");
		squareOfNum(15);
	}
public static void m1(int num1,int num2)
{
	System.out.println(num1+num2);
}
public void m2(int num1,int num2)
{
	System.out.println(num1-num2);
}
public static void squareOfNum(int num1)
{
	System.out.println(num1*num1);
}
}
