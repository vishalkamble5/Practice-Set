package method3;   //package name 

public class Sample4
{
public static void main(String[]args)
{
	addition(50,60,50);              //method name ();    //() includes parameters 
	addition(10,50,40);
	addition (90,10,5);              //  method call from same class   
	
	//System.out.println("---------");    static regular method 
	
Sample5.sub(100,20,30);                //method call from different class  //Sample5

//nonstatic regular method call from same/different class

Sample4 S4=new Sample4();
S4.addition(50,100,150);

Sample6 S6=new Sample6();            //create class for method from different class
S6.sub(500, 100, 50);
}
public static void addition(int num1,int num2,int num3)      
{
	System.out.println(num1+num2+num3);
	
}
public void add(int num7,int num8, int num9)
{
System.out.println(num7+num8+num9);	

}
}
