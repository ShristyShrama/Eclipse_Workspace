package JavaPackage;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<Integer, String>();

		h.put(1, "A");
		h.put(2, "B");
		h.put(3, "C");
		System.out.println(h.size());
		h.put(4, "D");
		h.put(5, "E");
		System.out.println(h.size());

		// h.remove(3);

		for (int i = 1; i <= h.size(); i++)
			System.out.println(h.get(i));

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "shr");
		// h1.put("a", "shrama");
		System.out.println(h.get(4));

	}

}
