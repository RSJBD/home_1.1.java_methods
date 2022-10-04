package javademo;

public class Normal {
 void add( )
 {
	 int a=5; 
	 int b=12;
	 int c;
	 c=a+b;
	  System.out.println("addtion is " +c);
			 
 }
 Normal()///CONSTRUCTOR
{
	System.out.println("constainer its creat 2nd but the result page was show the constainer was 1st display");
}
public static void All()
{
	Normal obj=new Normal();
	obj.add();	
}
public static void main(String[ ] f)
{
	
	All();
	
}

}
