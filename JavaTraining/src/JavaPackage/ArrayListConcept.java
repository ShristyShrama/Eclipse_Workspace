package JavaPackage;

import java.util.ArrayList;

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
		
		
		

	}

}
