package method_types;

public class String_withPara 
{
public static void main(String[] args) 
{
	Sname("Vishal");
	System.out.println("-----------");
	SLname("Kamble");
	System.out.println("------------");
	sFullName("Vishal","Uttamrao","Kamble");
}
public static void Sname(String Fname)
{
	System.out.println(Fname);
}
public static void SLname(String Lname)
{
	System.out.println(Lname);
}
public static void sFullName(String Fname,String Mname,String Lname)
{
	System.out.println(Fname+" "+ Mname+" "+ Lname);
}
}
