package javademo;

public class overload {
	void deposite ()
	{
		System.out.println("0.dep by card");
	}
	void deposite (int a)
	{
		System.out.println("1.dep by DD");
	}
	void deposite (int a,int b)
	{
		System.out.println("2.dep by NETBANKING");
	}
	void deposite (int a,int b,int c)
	{
		System.out.println("3.dep by UPI");
	}
	void deposite (int a,int b,int c,int d)
	{
		System.out.println("4.dep by Phonepe");
	}
	void deposite (int a,int b,int c,int d,int e)
	{
		System.out.println("5.dep by Google pay");
	}
	public static void overall()
	{
	overload obj=new overload(); 
	obj.deposite();
	obj.deposite(0);
	obj.deposite(0, 0);
	obj.deposite(0, 0, 0);
	obj.deposite(0, 0, 0, 0);
	obj.deposite(0, 0, 0, 0, 0);
	}
	public static void main(String[] s)
	{ 		overload.overall();
}
}
