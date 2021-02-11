package OOPS4;

public abstract class Shape {
	
	int color;
	
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	abstract void drawing(); //method without method body
	
    void fill() {  //method with method body
		System.out.println("Shape -- fill");
	}

}
