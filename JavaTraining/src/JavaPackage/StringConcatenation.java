package JavaPackage;

public class StringConcatenation {
	
	public static void main(String[] args) {

		int a=100;
		int b=200;
		
		String x ="Hello";
		String y ="World";
		
		double c=12.22;
		double d=10.11; 
		
	System.out.println(a+b);
	System.out.println(x+y);
	
	System.out.println(a+b+x+y); //300HelloWorld
	System.out.println(x+y+a+b); //HelloWorld100200 -- bcoz of left to right execution
	
	System.out.println(x+y+(a+b)); //HelloWorld300
	
	System.out.println(a+b+x+y+a+y+b);
	
	System.out.println(x+y+c+d);
		
	}

}
