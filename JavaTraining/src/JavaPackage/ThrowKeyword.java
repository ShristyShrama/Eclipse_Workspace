package JavaPackage;

public class ThrowKeyword {

	public static void main(String[] args) { //either u write (throws Exception)-- it only catch exception(not handle)

		System.out.println("ABC");

		try {
			throw new Exception("Shristy Exception"); // delibrately we throw exception
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("PQR");

	}

}
