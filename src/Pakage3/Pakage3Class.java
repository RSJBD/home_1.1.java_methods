package Pakage3;
import javademo.ClassCallInClass;
import javademo.overload;
import javademo.SaticOverload;
import Pakage2.Pakage2Class;


public class Pakage3Class {
	static void hii()
	{
		System.out.println("call pakage from another pakage1");
	}
	static void bye()
	{
		Pakage3Class.hii();
}
	static void CallAll()
	{
		Pakage3Class.bye();	
		ClassCallInClass.All();
		overload.overall();
		SaticOverload.OLS();
		Pakage2Class obj=new Pakage2Class();
				obj.hiii();
				
	}
	public static void main(String[] d) 
	{
		CallAll();
	}
}