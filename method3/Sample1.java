package method3;          //package name

public class Sample1       //class declaration
{
public static void main(String[]args)         //main method declartion
{   //without having parameter with static method
	addition();                                           //method called from same class
Sample2.addition();                                      //method called from different class (sample2)
//without having parameter with non static method
	Sample1 S1=new Sample1();                      //create object of same class
		S1.add();	                              //method call
		Sample3 S3=new Sample3();                  //create object of different class
		S3.addition();                              //method call
}
public static void addition()
{
	int num1=29;
	int num2=25;
	int num3 =45;

System.out.println(num1+num2+num3);
}
public void add()
{
	int num1=78;
	int num2=55;
	int num3=65;
	System.out.println(num1+num2+num3);


}
}
