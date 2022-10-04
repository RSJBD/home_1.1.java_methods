package javademo;

public class SaticOverload {
	 static void deposite ()
	{
		System.out.println("0.dep by card");
	}
	 static void deposite (int a)
	{
		System.out.println("1.dep by DD");
	}
	 static void deposite (int a,int b)
	{
		System.out.println("2.dep by NETBANKING");
	}
	 static void deposite (int a,int b,int c)
	{
		System.out.println("3.dep by UPI");
	}
	 static void deposite (int d,int a,int b,int c)
	{
		System.out.println("4.dep by Phonepe");
	}
	 static void deposite (String g,int a,int b,int c,int e)
	{
		System.out.println("5.dep by Google pay");
	}
	 public static void OLS()
	 {
		
			deposite();
			deposite(0);
			deposite(0, 0);
			deposite(0, 0, 0);
			deposite(0, 0, 0, 0);
			deposite("", 0, 0, 0, 0); 
	 }
	public static void main(String[ ] h) 
	{
		OLS();
	}

}
