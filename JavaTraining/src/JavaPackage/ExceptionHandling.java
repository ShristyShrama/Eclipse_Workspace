package JavaPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			//int i=9/0;
			}
		catch(Throwable e) {
			e.printStackTrace();         // so that exception display
			System.out.println(e.getMessage());  //print exception
			
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

	}

}
