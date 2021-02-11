package TestPackage;

public class ParentClass { //if write-- public final class ParentClass -> no child class can extend it. 

	public void start() { //if write-- public final void start() -> method can't be use anywhere.
		System.out.println("parent-- start method");
	}
}
