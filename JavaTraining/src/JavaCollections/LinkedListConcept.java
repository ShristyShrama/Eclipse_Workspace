package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		//add-- to add elements
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println("Elements are:"+ll);
		//addFirst-- to add element at first
		//addLast-- t add element at last
		ll.addFirst("A1");
		ll.addLast("D6");
		System.out.println("New Elements are:"+ll);
		//get-- to get value
		System.out.println(ll.get(0));
		//set-- to set value
		ll.set(0, "Tom");
		System.out.println("Elements:"+ll);
		//remove:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Fresh Elements:" +ll);
		ll.remove(2);
		System.out.println("Now:" +ll);
		//print linkedlist:
		//1.for loop
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//2.advance for loop
		
		for(String str:ll) {
			System.out.println(str);
		}
		//3.iterator
		
		Iterator<String>it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4.while
		
		int num=0;
		while(num<ll.size()) {
			System.out.println(ll.get(num));
			num++;
			
		}
		
		
		

	}

}
