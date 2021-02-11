package JavaPackage;

public class ThrowsKeyword {

	public static void main(String[] args) { // JVM will catch(not handling) it & display msg on console 
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
		}

	public void sum() {
		try{div();}
		catch(Throwable e) {}
	}

	public void div() throws ArithmeticException {
		//int i = 9 / 0; //exception line
	}

}
