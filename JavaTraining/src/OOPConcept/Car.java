package OOPConcept;

public class Car {
	//Class variables
	int model;
	int wheel;

	public static void main(String[] args) {
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2014;
		b.wheel=4;
		
		c.model=2013;
		c.wheel=4;
		
		System.out.println("Before shifting:");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After shifting:");
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model); //10
		c.model=20;
		System.out.println(a.model); //20
		System.out.println(c.model);
		

	}

}
