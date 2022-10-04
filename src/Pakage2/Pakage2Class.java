package Pakage2;

import javademo.DEEMO;
public class Pakage2Class {
public void hiii()
{
	System.out.println("call package from another pakage");
}
  public static void pakagee2()
{
	  Pakage2Class obj2=new Pakage2Class();
			  obj2.hiii();
			  
	DEEMO obj=new DEEMO();
	obj.demo();
	
}
public static void main(String[] d)
{
	pakagee2();
}
}
