package JavaPackage;

public class ConstructorwithThisKeyword {
	
	String name;
	int age;
	String dept;
	
	public ConstructorwithThisKeyword(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("name is "+name);
		System.out.println("Age is "+age);
		}

	public ConstructorwithThisKeyword(String name, int age, String dept) {
		this.name=name;
		this.age=age;
		this.dept=dept;
		System.out.println("name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Dept is "+dept);
		}
	
	public static void main(String[] args) {
		
		//ConstructorwithThisKeyword ob=new ConstructorwithThisKeyword("shristy",23);
		//ConstructorwithThisKeyword ob1=new ConstructorwithThisKeyword("Tom",22,"QA");
		}

}
