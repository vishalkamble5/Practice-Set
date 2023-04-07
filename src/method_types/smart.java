package method_types;

public class smart     //class declaration 
{
//class body
	public static void main(String[]args)       //main method declaration
	{
		//main method body
		
		p();          //Regular static method call from same class
		
		smart R1=new smart();   //Regular non static method call from same class
		
		// class name object name = new class name();       //create object
		
		R1.R();          //Object name.method name   //method call
		
	}
	
	public static void p()
	{
		
		System.out.println("Suresh is brave boy.");
		System.out.println("Sachin carry books in his bag.");
		
	}
	public void R()
	{
		System.out.println("Car is light motor vehicle");
		System.out.println("Various applications now can run on mobile");
		
	}
	
	
	
	
	
	
	
}
