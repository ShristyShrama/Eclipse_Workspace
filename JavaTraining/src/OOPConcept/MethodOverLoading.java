package OOPConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj=new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum("Shristy");
		obj.sum(10, 20);
		main(20); // or MethodOverLoading.main(20);
		
	}
	
	public static void main()           // main method can be overloaded
	{
		
	}
	
	public static void main(int p)
	{
		System.out.println(p);
	}

	public void sum()
	{
		System.out.println("sum method-- zero argument");
	}
	
	public void sum(int i)
	{
		System.out.println("Sum method-- 1 argument ");
		System.out.println(i);
	}
	
	public void sum(String s)
	{
		System.out.println("Sum method-- 1 argument with diff datatype");
		System.out.println(s);
	}
	
	public void sum(int i, int j)
	{
		System.out.println("Sum method-- 2 arguments");
		System.out.println(i+j);
	}
}

