package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start(); //--call child class wala method not from parent class
		b.theftsafty();
		b.stop();
		b.refuel();
		b.engine(); 
		
		System.out.println("**********");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
		//Top Casting 0r dynamic/run-time polymorphism
		Car c1=new BMW();//child class object can be reffered by parent class reference
		//variable--dynamic/run-time polymorphism
		c1.start(); //--call child class wala not from parent class
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW b1=(BMW)new Car();//indexing
		b1.engine();
		// ClassCastException 
		

	}

}
