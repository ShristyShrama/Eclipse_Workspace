package OOPConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//Wrapper-- to convert string to int, boolean, double 
		
		//string to integer
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//string to boolean
		String a="true";
		boolean b=Boolean.parseBoolean(a);
		System.out.println(b);
		
		//string to double
		String y="12.33";
		Double z=Double.parseDouble(y);
		System.out.println(z+.33);
		
		//Integer  to String
		int l=10;
		String m=String.valueOf(l);
		System.out.println(m+10);
		
		String u="100A"; //will display no. format exception
		int v=Integer.parseInt(u);
		System.out.println(v);
		
		
		
	}

}
