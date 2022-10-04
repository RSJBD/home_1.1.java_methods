package javademo;

public class ClassCallInClass {

	static void ccc() {
		System.out.println("call class in same pakage + 2 class  ");
	}
	 ClassCallInClass()
	{
		System.out.println("constainer ccc");
	}
	public static void All() 
	{
		ClassCallInClass.ccc();///static
		
		new ClassCallInClass();//Constrained
		add obj2=new add();
			obj2.xyz();
			
		Normal.All();//other class Static calling(no need boj creator in ststic method)(Normal --->Class, ALL--->Method)`
	}
		public static void main (String[] f)
		{
			All();
			
	}
}
