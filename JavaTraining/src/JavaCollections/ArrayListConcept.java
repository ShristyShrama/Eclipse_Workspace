package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
    ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(100);//0 
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size()); 
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		
		ar.remove(0);
		System.out.println(ar.size());
		
		//to print all elements of list: for loop 
		for (int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		//Generic & non-generic concept:
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(100);
		System.out.println(ar1.get(0));
		//ar1.add("shr"); --will give error
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("shrama");
		System.out.println(ar2.get(0));
		//ar2.add(1);
		
		//Employee class object:
		Employee e1=new Employee("Shristy",23,"QA");
		Employee e2=new Employee("Tom",24,"Dev");
		Employee e3=new Employee("Peter",25,"Admin");
		
		//Create ArrayList:
		ArrayList<Employee> k=new ArrayList<Employee>();
		k.add(e1);
		k.add(e2);
		k.add(e3);
		
		//Using Iterator to print all values
		Iterator<Employee> it =k.iterator();
		while (it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("************");
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("A");
		ar3.add("B");
		ar3.add("C");
		
		ArrayList<String> ar4=new ArrayList<String>();
		ar4.add("A");
		ar4.add("D");
		ar4.add("F");
		
		ar3.addAll(ar4); //add
		
		for(int i=0; i<ar3.size();i++) {
			System.out.println(ar3.get(i));
		}
		
		System.out.println("**************");
		ar3.removeAll(ar4);  //remove
		
		for(int i=0; i<ar3.size();i++) {
			System.out.println(ar3.get(i));
		}
		
		System.out.println("***********");
		 
		ar3.retainAll(ar4); // Show common values -- not execute
		
		for(int i=0; i<ar3.size();i++) {
			System.out.println(ar3.get(i));
		}
		
	}

}
