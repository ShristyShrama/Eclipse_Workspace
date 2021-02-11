package OOPConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		
		System.out.println(obj.add());
		
		String sl=obj.st();
		System.out.println(sl);
		
		System.out.println(obj.div(30, 10));
		}
	
	
	public void test() //no input, no output
	{
		System.out.println("Test method");
	}
	
	public int add() //no input, some output
	{
		System.out.println("Add method");
		int a=20;
		int b=10;
		int c=a+b;
		
		return c;
	}
	
	public String st() //no input, some output 
	{
		System.out.println("String method");
		String s="Selenium";
		
		return s;
	}
	
	public int div(int x,int y) //some input, some output
	{
		System.out.println("Div method");
		int d=x/y;
		
		return d;
	}

}
