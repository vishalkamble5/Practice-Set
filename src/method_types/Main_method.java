package method_types;

public class Main_method 
{
public static void main(String[] args) 
{
	addition();  
	System.out.println("---------------------");
	Main_method M =new Main_method();
	M.substraction();
	System.out.println("----------------------");
	Sample_1.mult();
	System.out.println("----------------------");
	Sample_1 M1 =new Sample_1();
	M1.div();
	System.out.println("----------");
	Sample_3.Sinfo("Vishal", 12, 'A', 75f);
}
public static void addition()
{
	System.out.println("regular static method addition call from same class");

}
public void substraction()
{
	System.out.println("Reular non static method substraction call from same class");
}

}
