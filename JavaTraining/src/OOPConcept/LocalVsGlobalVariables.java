package OOPConcept;

public class LocalVsGlobalVariables {
 
	// Global Variables or class Variables
			String name="Tom";
			int age=25;
			
    public static void main(String[] args) {
		int i=10;                  // local var for main()
		System.out.println(i);
		
		LocalVsGlobalVariables obj1=new LocalVsGlobalVariables();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		LocalVsGlobalVariables obj2=new LocalVsGlobalVariables();
		obj2.sum();
		
		
    }

    public void sum()
    {
    	int i=10;              // local var for sum()
    	int j=15;
    	int k=i+j;
    	System.out.println(k);
    	
    	
    }
}
