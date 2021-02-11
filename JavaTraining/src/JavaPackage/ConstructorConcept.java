package JavaPackage;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Defaut cons");
	}

	public ConstructorConcept(int i) {
		System.out.println("i=" + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}

	public static void main(String[] args) {

		/*ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept(10);
		ConstructorConcept obj3 = new ConstructorConcept(10, 20);*/

	}

}
